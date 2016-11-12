package com.mas.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class WeatherDao {
	
	public Connection getConnection(){
		Connection con=null;
		String url="jdbc:mysql://localhost/Employee";
		String userName="root";
		String pwd="root";
		
		
		try{
			System.out.println("Loading the mySQL Driver");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mySQL Driver Loading Successful");
		}
		catch(Exception e){
			System.out.println("Class not found to load the driver");
			e.printStackTrace();
		}
		
		try{
				
				con= DriverManager.getConnection(url, userName, pwd);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		return con;	
	}

	public Weather getWeatherByCityId(int cityid){
		Weather w = null;
		
		
		try{
			Connection con = this.getConnection();
			
			if (con!=null){
				System.out.println("Connection to "+ con.getCatalog()+ " is successful");
			}
			else{
				System.out.println("Connection unsuccessful");
			}
			
			PreparedStatement stmByCityId= con.prepareStatement("Select * from Weather where cityid=?");
			stmByCityId.setInt(1, cityid);
			ResultSet rs= stmByCityId.executeQuery();
			
			if (rs.next()){
				int cid= rs.getInt(1);
				String name= rs.getString(2);
				int temp= rs.getInt(3);
				
				w= new Weather(cid, name, temp);
			}
			
		}
		catch(Exception e){
			System.out.println("The connection to database was unsuccessful");
			e.printStackTrace();
		}
			
		return w;
	}


	public int getTempByWeather(Weather w){
		String cname= w.getName();
		int temp=100;
		
		
		try{
			Connection con = this.getConnection();
			
			if (con!=null){
				System.out.println("Connection to "+ con.getCatalog()+ " is successful");
			}
			else{
				System.out.println("Connection unsuccessful");
			}
			
			PreparedStatement stmtTempByCity=con.prepareStatement("Select * from Weather where name=?");
			stmtTempByCity.setString(1, cname);
			ResultSet rs= stmtTempByCity.executeQuery();
			
			if(rs.next()){
				temp= rs.getInt("temp");
			}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return temp;
			
	}


}


