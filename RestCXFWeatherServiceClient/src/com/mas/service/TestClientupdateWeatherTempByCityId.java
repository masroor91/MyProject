package com.mas.service;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClientupdateWeatherTempByCityId {

	public static void main(String[] args) {
		
		String uri="http://localhost:8080/RestCXFWeatherService/rest/weatherService/weatherService/updateWeatherTempByCityId?cityid=400&temp=200";
		WebClient client = WebClient.create(uri);
		
		Response res= client.get();
		
		System.out.println("Status: "+ res.getStatus());
		System.out.println("Response Message: "+ res.readEntity(String.class));

	}

}
