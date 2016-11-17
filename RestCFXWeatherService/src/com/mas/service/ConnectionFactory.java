package com.mas.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection(){
		Connection con= null;
		
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			String url="jdbc:db2://PC181461.cts.com:50000/MAS";
			String userName="db2admin5";
			String pwd="Admin@123";
			
			con= DriverManager.getConnection(url, userName, pwd);
			
			if (con!=null){
				System.out.println("Coonection to " + con.getCatalog() + " is successful");
			}
			else{
				System.out.println("Connection to the database is failed");
			}
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return con;
	}

}
