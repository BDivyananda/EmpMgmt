package EmpController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import EmpModel.Emp;

public class EmpDao {
	public static Connection connectDB() 
    { 
        
		Connection conn = null;
        try { 
             String url = "jdbc:mysql://localhost:3306/EmployeeMgmt";
             String username = "root";
             String password = "Admin@2024";
            
             
               conn = DriverManager.getConnection(url,username,password); 
        } 
  
        catch (Exception message) { 
            System.out.println(message); 
            
        } 
        
		return conn;
        
		 
    }

	public static int save(Emp e){  
        int status=0;  
        try{  
        	
        	
            Connection con= EmpDao.connectDB();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into employee(id,name,dept,salary) values (?,?,?,?)");  
            ps.setInt(1,e.getId());  
            ps.setString(2,e.getName());
            ps.setString(3,e.getDept());
            ps.setDouble(4,e.getSalary());
            
            
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
	
//	 public static int create(Emp e){  
//	        int status=0;  
//	        try{  
//	            Connection con= EmpDao.connectDB();  
//	            PreparedStatement ps=con.prepareStatement(  
//	                         "create table employee (id int(20) primary key , name varchar(255), name dept (255), int (30)");  
//	            ps.setInt(1,1);  
//	            ps.setString(2,"qwerty");
//	            ps.setString(3,"it");
//	            ps.setDouble(4,20000);
//	            
//	            
//	              
//	            status=ps.executeUpdate();  
//	              
//	            con.close();  
//	        }catch(Exception ex){ex.printStackTrace();}  
//	          
//	        return status;  
//	    }
	 
	 public static int update(Emp e){  
	        int status=0;  
	        try{  
	            Connection con= EmpDao.connectDB();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update employee set name=?,dept=?,salary=? where id=?");  
	              
	            ps.setString(1,e.getName());
	            ps.setString(2,e.getDept());
	            ps.setDouble(3, e.getSalary());
	            ps.setInt(4,e.getId());
	            
	            
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }
	 
		/*
		 * public static int delete(int id){ int status=0; try{ Connection
		 * con=EmpDao.connectDB(); PreparedStatement
		 * ps=con.prepareStatement("delete from employee where id=?"); ps.setInt(1,id);
		 * status=ps.executeUpdate();
		 * 
		 * con.close(); }catch(Exception e){e.printStackTrace();}
		 * 
		 * return status; }
		 */

	 
}
