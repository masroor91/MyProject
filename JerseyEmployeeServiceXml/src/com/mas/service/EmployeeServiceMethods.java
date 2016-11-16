package com.mas.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeServiceMethods {
	
	Connection con= ConnectionFactory.getConnection();
	
	public ArrayList<Employee> getAllEmployee(){
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		try{
			Statement getAllEmp= con.createStatement();
			String sql="Select * from employee";
			ResultSet rs=getAllEmp.executeQuery(sql);
			Employee emp= null;
			while(rs.next()){
				int eid=rs.getInt(1);
				String name= rs.getString(2);
				int salary=rs.getInt(3);
				
				emp= new Employee(eid, name, salary);
				list.add(emp);
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return list;	
	}
	
	

	public Employee getEmployeeById(int eid){
		Employee emp= null;
		try{
			PreparedStatement getEmpById= con.prepareStatement("Select * from employee where eid=?");
			getEmpById.setInt(1, eid);
			ResultSet rs= getEmpById.executeQuery();
			
			if (rs.next()){
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public int createEmployee(Employee emp){
		int eid = emp.getEid();
		String name= emp.getName();
		int salary= emp.getSalary();
		int noOfRecordsUpdated=0;
		try{
			if (checkRecordAvailability(eid)>0){
				return 0;
			}
			else{
				PreparedStatement creatEmp=con.prepareStatement("Insert into Employee values(?,?,?)");
				creatEmp.setInt(1, eid);
				creatEmp.setString(2, name);
				creatEmp.setInt(3, salary);
				noOfRecordsUpdated=creatEmp.executeUpdate();
			}

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return noOfRecordsUpdated;
	}
	
	
	public int deleteEmployee(Employee emp){
		int eid= emp.getEid();
		int noOfRecordsUpdated=0;
		
		try{
			if (checkRecordAvailability(eid)==0){
				return 0;
			}
			else{
				PreparedStatement deleteEmpById=con.prepareStatement("Delete from Employee where eid=?");
				deleteEmpById.setInt(1,eid);
				noOfRecordsUpdated=deleteEmpById.executeUpdate();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int deleteEmployeeById(int eid){
		
		int noOfRecordsUpdated=0;
		
		try{
			if (this.checkRecordAvailability(eid)==0){
				return 0;
			}
			else{
				PreparedStatement deleteEmpById=con.prepareStatement("Delete from Employee where eid=?");
				deleteEmpById.setInt(1,eid);
				noOfRecordsUpdated=deleteEmpById.executeUpdate();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int updateEmployeeSalary(Employee emp){
		
		int eid=emp.getEid();
		int salary= emp.getSalary();
		int noOfRecordsUpdated=0;
		
		try{
			if (checkRecordAvailability(eid)==0){
				return 0;
			}
			else{
				PreparedStatement updateEmpSal=con.prepareStatement("Update Employee set salary=? where eid=?");
				updateEmpSal.setInt(1, salary);
				updateEmpSal.setInt(2, eid);
				noOfRecordsUpdated =updateEmpSal.executeUpdate();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int updateEmployeeSalaryById(int eid, int salary){
		
		int noOfRecordsUpdated=0;
		
		try{
			if (this.checkRecordAvailability(eid)==0){
				return 0;
			}
			else{
				PreparedStatement updateEmpSal=con.prepareStatement("Update Employee set salary=? where eid=?");
				updateEmpSal.setInt(1, salary);
				updateEmpSal.setInt(2, eid);
				noOfRecordsUpdated =updateEmpSal.executeUpdate();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return noOfRecordsUpdated;
	}
	
	public int checkRecordAvailability(int eid){
		
		int recordAvailable=0;
		try{
			PreparedStatement checkRecord= con.prepareStatement("Select * from Employee where eid=?");
			checkRecord.setInt(1, eid);
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
