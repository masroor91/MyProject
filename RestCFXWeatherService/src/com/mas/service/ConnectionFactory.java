package com.mas.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection(){
		Connection con= null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost/Employee";
			String userName="root";
			String pwd="root";
			
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
