package com.mas.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestgetAllEmployeeClient {

	public static void main(String[] args) {
		ClientConfig clientConfig= new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client c= Client.create(clientConfig);
		String uri="http://localhost:8080/JerseyEmployeeService/rest/employeeService/getAllEmployee";
		WebResource resource1 = c.resource(uri);
		
//		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
//		
//		List<Employee> employees=response.getEntity(new GenericType<ArrayList<Employee>>(){});

		List<Employee> employees=resource1.accept("application/json").get(new GenericType<ArrayList<Employee>>(){});
		
		StringBuilder builder = new StringBuilder("=================Employees===============\n");
		for(Employee emp:employees){
			builder.append("EmpId: ").append(emp.getEid()).append(", Name: ")
			.append(emp.getName()).append(", Salary: ").append(emp.getSalary()).append("\n");
		}
		
		builder.append("========================================");
		
		System.out.println(builder.toString());
		
		for(Employee emp:employees){
			System.out.println(emp);
		}
	}

}
