package com.mas.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestceateEmployeeClient {

	public static void main(String[] args) {
		
//		ClientConfig clientConfig= new DefaultClientConfig();
//		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//		
//		Client c = Client.create(clientConfig);
		
		Client c= new Client();
		c.addFilter(new HTTPBasicAuthFilter("mvr", "@mvr"));
		
		String uri="http://localhost:8080/JerseyEmployeeServiceXml/rest/employeeService/createEmployee";
		WebResource resource1=c.resource(uri);
		
		Employee emp = new Employee();
		emp.setEid(200);
		emp.setName("Pradeep");
		emp.setSalary(20000);
		
		ClientResponse clientResp=resource1.type(MediaType.APPLICATION_XML).post(ClientResponse.class, emp);
		int status= clientResp.getStatus();
		String resp= clientResp.getEntity(String.class);
		
		System.out.println("Status Code: "+ status);
		System.out.println("Output :" + resp);
	
	}

}
