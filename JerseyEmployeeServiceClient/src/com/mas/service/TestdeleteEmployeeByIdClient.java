package com.mas.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestdeleteEmployeeByIdClient {

	public static void main(String[] args) {
		/*ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		*/
		Client c= new Client();
		
		String uri="http://localhost:8080/JerseyEmployeeService/rest/employeeService/deleteEmployeeById?eid=200";
		
		WebResource resource1= c.resource(uri);
		
		ClientResponse clientResp=resource1.get(ClientResponse.class);
		
		int status= clientResp.getStatus();
		String respStr=clientResp.getEntity(String.class);
		
		System.out.println("Status: "+ status);
		System.out.println("Output: " + respStr);

	}

}
