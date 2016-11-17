package com.mas.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WeatherDao {
	Connection con = ConnectionFactory.getConnection();
	
	public List<Weather> getAllWeather(){
		List<Weather> list = new ArrayList<Weather>();
		
		try{
			Statement stmAll=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql="Select * from Weather";
			ResultSet rs=stmAll.executeQuery(sql);
			Weather w=null;
			if (!rs.next()){
				list=null;
			}
			else{
				rs.beforeFirst();
				while(rs.next()){
					
					int cityid=rs.getInt(1);
					String name= rs.getString(2);
					int temp=rs.getInt(3);
					
					w= new Weather(cityid, name, temp);
					System.out.println(w);
					list.add(w);
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		
		return list;
	}
	
	public Weather getWeatherByCityId(int cityid){
		Weather w= null;
		int flag=checkRecordAvailability(cityid);
		try{
			if (flag==0){
				w=null;
			}
			else if (flag>0){
				
				String sql="Select * from Weather where cityid=?";
				PreparedStatement stmtgetWeatherByCityId= con.prepareStatement(sql, 
						ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
				stmtgetWeatherByCityId.setInt(1, cityid);
		
				ResultSet rs= stmtgetWeatherByCityId.executeQuery();
		
				if (rs.next()){
					int cid= rs.getInt(1);
					String name=rs.getString(2);
					int temp=rs.getInt(3);
					w= new Weather(cid , name, temp);
				}
			}
			else{
				w=null;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			 return null;
		}
		
		return w;
	}
	
	public Weather getWeatherByCity(String cityname) {
		Weather w= null;
		int flag=checkRecordAvailability(cityname);
		try{
			if (flag==0){
				w=null;
			}
			else if (flag>0){
				PreparedStatement stmtgetWeatherByCityId= con.prepareStatement("Select * from Weather where name=?");
		
				stmtgetWeatherByCityId.setString(1, cityname);
		
				ResultSet rs= stmtgetWeatherByCityId.executeQuery();
		
				if (rs.next()){
					int cid= rs.getInt(1);
					String name=rs.getString(2);
					int temp=rs.getInt(3);
					w= new Weather(cid , name, temp);
				}
			}
			else{
				w=null;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return w;
	}
	
	public int createWeather(Weather w){
		int noOfRecordsUpdated=0;
		int cityid= w.getCityid();
		String cityName=w.getName();
		int temp= w.getTemp();
		int flag=checkRecordAvailability(w.getCityid());
		try{
			if (flag>0){
				noOfRecordsUpdated=0;
			}
			else if (flag==0){
				PreparedStatement createWeath=con.prepareStatement("Insert into Weather Values(?,?,?)");
				createWeath.setInt(1, cityid);
				createWeath.setString(2, cityName);
				createWeath.setInt(3, temp);
				
				noOfRecordsUpdated=createWeath.executeUpdate();
			}
			else{
				noOfRecordsUpdated=-1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	
	public int deleteWeatherByCityId(int cityid) {
		int noOfRecordsUpdated=0;
		int flag=checkRecordAvailability(cityid);
		try{
			if (flag==0){
				noOfRecordsUpdated=0;
			}
			else if (flag>0){ //if record available
				
			
				PreparedStatement stmtgetWeatherByCityId= con.prepareStatement("Delete from Weather where cityid=?");
		
				stmtgetWeatherByCityId.setInt(1, cityid);
		
				noOfRecordsUpdated= stmtgetWeatherByCityId.executeUpdate();
		
			}
			else{
				noOfRecordsUpdated=-1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			 return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	
	public int updateWeatherTempByCityId(int cityid, int temp) {
		int noOfRecordsUpdated=0;
		int flag=checkRecordAvailability(cityid);
		try{
			if (flag==0){
				noOfRecordsUpdated=0;
			}
			else if (flag>0){ //if record available update temperature
				
			
				PreparedStatement stmtupdateWeatherByCityId= con.prepareStatement("Update Weather set temp=? where cityid=?");
		
				stmtupdateWeatherByCityId.setInt(1, cityid);
				stmtupdateWeatherByCityId.setInt(2, temp);
		
				noOfRecordsUpdated= stmtupdateWeatherByCityId.executeUpdate();
		
			}
			else{
				noOfRecordsUpdated=-1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			 return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int updateWeatherTemp(Weather w) {
		int noOfRecordsUpdated=0;
		int cityid=w.getCityid();
		int temp= w.getTemp();
		int flag=checkRecordAvailability(cityid);
		try{
			if (flag==0){
				noOfRecordsUpdated=0;
			}
			else if (flag>0){ //if record available update temperature
				
			
				PreparedStatement stmtupdateWeatherByCityId= con.prepareStatement("Update Weather set temp=? where cityid=?");
		
				stmtupdateWeatherByCityId.setInt(1, cityid);
				stmtupdateWeatherByCityId.setInt(2, temp);
		
				noOfRecordsUpdated= stmtupdateWeatherByCityId.executeUpdate();
		
			}
			else{
				noOfRecordsUpdated=-1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			 return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int checkRecordAvailability(int cityid){
		
		int recordAvailable=0;
		try{
			PreparedStatement checkRecord= con.prepareStatement("Select * from Weather where cityid=?");
			checkRecord.setInt(1, cityid);
			ResultSet rs= checkRecord.executeQuery();
			
			if(!rs.next()){
				recordAvailable=0; //If Result set dont have any records
			}
			else{
				recordAvailable=1; //If Resultset  is present
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
		return recordAvailable;
	}
	
	public int checkRecordAvailability(String cityname){
		
		int recordAvailable=0;
		try{
			PreparedStatement checkRecord= con.prepareStatement("Select * from Weather where name=?");
			checkRecord.setString(1, cityname);
			ResultSet rs= checkRecord.executeQuery();
			
			if(!rs.next()){
				recordAvailable=0; //If Result set dont have any records
			}
			else{
				recordAvailable=1; //If Resultset  is present
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
		return recordAvailable;
	}
	
}
