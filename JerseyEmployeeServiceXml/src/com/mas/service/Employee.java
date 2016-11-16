package com.mas.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
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

	@XmlElement(name="EmpId")
	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}

	@XmlElement(name="Name")
	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}

	@XmlElement(name="Salary")
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [getEid()=" + getEid() + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	
}
