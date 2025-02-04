import java.sql.*;
import java.io.*;
class JDBCDemo {
	public static void main(String args[]) throws SQLException {
		Connection con =null;
		Statement st =null;
		ResultSet rs =null;
		try{
			Class.forName("org.postgresql.Driver");

			System.out.println("Driver Loaded Successfully");
			
			con=DriverManager.getConnection("jdbc:postgresql:mitesh","postgres","Nitesh"); 
			if(con==null){
				System.out.println("failed");
			}else{
				System.out.println("Connection Established successfully");
			}
		}catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}

