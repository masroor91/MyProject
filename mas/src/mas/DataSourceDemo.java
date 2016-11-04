package mas;
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;

public class DataSourceDemo {
	public static void main(String [] args){
		String dsn=args[0];
		System.out.println("Attempting to connect to "+ dsn);
		
		try{
			System.out.println("Initializing the naming context");
			InitialContext init= new InitialContext();
			
			System.out.println("Looking up DSN");
			DataSource source= (DataSource) init.lookup(dsn);
			
			System.out.println("Establishing the connection");
			Connection con= source.getConnection();
			
			System.out.println("Connect to "+ con.getCatalog() + " is success");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
