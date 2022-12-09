import java.sql.*;
class Mysql{
public static void main(String args[]){ try{ Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sono","root","1234");
//here sonoo is database name, root is username and password

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp1");
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
}
con.close();
}
catch(Exception e){ System.out.println(e);}
} }