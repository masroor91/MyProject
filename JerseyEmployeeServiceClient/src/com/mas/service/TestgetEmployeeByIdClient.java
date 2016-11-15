package com.mas.service;

import javax.ws.rs.core.MediaType;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestgetEmployeeByIdClient {

	public static void main(String[] args) {

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client c = Client.create(clientConfig);
		
		String uri="http://localhost:8080/JerseyEmployeeService/rest/employeeService/getEmployeeById/100";
		WebResource resource1 = c.resource(uri);
		Employee emp=resource1.accept(MediaType.APPLICATION_JSON).get(Employee.class);
		
		StringBuilder builder= new StringBuilder("=================Employee================\n");
		builder.append("EmpId: ").append(emp.getEid()).append(", Name: ")
		.append(emp.getName()).append(", Salary: ").append(emp.getSalary()).append("\n");
		
		builder.append("=========================================");
		
		System.out.println(builder);
		
		System.out.println(emp);
		
		
	}

}
