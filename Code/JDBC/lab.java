import java.sql.*;  
public class lab {  
public static void main(String[] args) throws Exception{  
  
Class.forName("com.mysql.jdbc.Driver.");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/dbms","root","1234");  
  
CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(1,10);  
stmt.setString(2,"Amit");  
stmt.execute();  
  
System.out.println("success");  
}  
}