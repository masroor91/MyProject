package com.mas.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeServiceMethods {
	
	public ArrayList<Employee> getAllEmployee(){
		Connection con= ConnectionFactory.getConnection();
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		try{
			Statement getAllEmp= con.createStatement();
			String sql="Select * from eployee";
			ResultSet rs=getAllEmp.executeQuery(sql);
			Employee emp= null;
			while(rs.next()){
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				int salary=rs.getInt(2);
				
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
		Connection con = ConnectionFactory.getConnection();
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
		Connection con= ConnectionFactory.getConnection();
		int eid = emp.getEid();
		String name= emp.getName();
		int salary= emp.getSalary();
		int noOfRecordsUpdated=2;
		try{
			PreparedStatement creatEmp=con.prepareStatement("Insert into Employee values(?,?,?)");
			creatEmp.setInt(1, eid);
			creatEmp.setString(2, name);
			creatEmp.setInt(3, salary);
			noOfRecordsUpdated=creatEmp.executeUpdate(); //returns 1 if executed for 1 rows 0 if no rows effected
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return noOfRecordsUpdated;
	}
	
}
