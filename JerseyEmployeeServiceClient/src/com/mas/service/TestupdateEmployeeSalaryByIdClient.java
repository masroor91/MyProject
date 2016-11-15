package com.mas.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestupdateEmployeeSalaryByIdClient {

	public static void main(String[] args) {
		Client c= new Client();
		
		String uri="http://localhost:8080/JerseyEmployeeService/rest/employeeService/updateEmployeeSalaryById?eid=200&salary=21000";
	
		WebResource resource1= c.resource(uri);
		
		ClientResponse clientResp= resource1.get(ClientResponse.class);
		
		System.out.println("Status: " + clientResp.getStatus());
		System.out.println("Output: "+ clientResp.getEntity(String.class));

	}

}
