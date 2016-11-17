package com.mas.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClientcreateWeather {

	public static void main(String[] args) {
		
		String uri="http://localhost:8080/RestCXFWeatherService/rest/weatherService/weatherService/createWeather";
		WebClient client = WebClient.create(uri);
		Weather w = new Weather(400, "Chennai", 250);
		
		Response res=client.type(MediaType.APPLICATION_XML).post(w, Response.class);
		
		String resp= res.readEntity(String.class);
		System.out.println("Status: "+ res.getStatus());
		System.out.println("Response Message: " + resp);

	}

}
