package com.mas.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	static Connection getConnection(){
		Connection con= null;
		
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			String url="jdbc:db2://localhost/Mas";
			String userName="db2Admin5";
			String pwd="Admin@123";
			con= DriverManager.getConnection(url, userName, pwd);
			
			if (con!=null){
				System.out.println("Connection to " + con.getCatalog() + " is successful");
			}
			else{
				System.out.println("Connection to the database could not be established");
			}
			
		}
		catch(ClassNotFoundException e){
			System.out.println("Class of DB2 Driver could not be located");
			e.printStackTrace();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
		return con;
	
	}
	
	

}
