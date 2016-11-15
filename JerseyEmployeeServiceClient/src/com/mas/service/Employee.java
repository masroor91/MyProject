package com.mas.service;

public class Employee {

	private int eid;
	private String name;
	private int salary;
	
	
	public Employee() {
		super();
	}


	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [getEid()=" + getEid() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	
}
