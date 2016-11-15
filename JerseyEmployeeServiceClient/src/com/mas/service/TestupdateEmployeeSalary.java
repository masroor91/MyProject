package com.mas.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestupdateEmployeeSalary {

	public static void main(String[] args) {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client c= Client.create(clientConfig);
		String uri="http://localhost:8080/JerseyEmployeeService/rest/employeeService/updateEmployeeSalary";
		
		WebResource resource1= c.resource(uri);
		Employee emp = new Employee();
		emp.setEid(200);
		emp.setSalary(16000);
		ClientResponse clientResp=resource1.type(MediaType.APPLICATION_JSON).put(ClientResponse.class, emp);
		
		System.out.println("Status: "+ clientResp.getStatus());
		System.out.println("Ouput: " + clientResp.getEntity(String.class));
	}

}
