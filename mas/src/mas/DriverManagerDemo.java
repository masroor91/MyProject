package mas;
import java.sql.*;

public class DriverManagerDemo {
	public static void main(String [] args){
		String url= "jdbc:mysql://"+args[0];
		String userName= args[1];
		String pwd= args[2];
		System.out.println("Attemping to connect to " + url);
		
		try{
			System.out.println("Loading the driver...");
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException ex){
			 System.out.println("Please include Classpath  Where your MySQL Driver is located");
	           ex.printStackTrace();
	           return;
		}
		
		try{
			System.out.println("MySQL driver is loaded successfully");
			System.out.println("Establishing the connection");
			Connection con= DriverManager.getConnection(url, userName, pwd);
			 if (con != null)
	            {
	                System.out.println("MySQL Database Connected");
	            }
	            else
	            {
	                System.out.println("MySQL connection Failed ");
	            }
			
			System.out.println("Connect to "+ con.getCatalog()+ " a success!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
