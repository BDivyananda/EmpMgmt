//package MyPackage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//public class DatabaseConnection {
//public static void main(String[] args) {
////establishing connection b/w java and sql
//       String url = "jdbc:mysql://localhost:3306/EmployeeMgmt";
//       String user = "root";
//       String password = "Admin@2024";
//       String sql = "INSERT INTO messages (id,content) VALUES (?,?)";
//       /*try {
//        Connection conn = DriverManager.getConnection(url,user,password);
//        if(conn != null)
//        {
//        System.out.println("Connected to database");
//        }}
//        catch(SQLException e) {
//        System.out.println("Connection failed!"+e.getMessage());
//        }*/
//       try (
//        Connection conn = DriverManager.getConnection(url,user,password);
//        PreparedStatement pstmt = conn.prepareStatement(sql)){
//        //set parameters
//        pstmt.setString(1, "2"); //id is unique
//        pstmt.setString(2, "Hello test2"); //set content
//        //execute the insert stmt
//        int rowsAf = pstmt.executeUpdate();
//        System.out.println("Rows Affected: "+rowsAf);
//        }
//       catch(SQLException e)
//       {
//        e.printStackTrace(); //this powerful method on exception it tells us where the error occurred in the prg.
//       }
//       
//       }
//}
 
