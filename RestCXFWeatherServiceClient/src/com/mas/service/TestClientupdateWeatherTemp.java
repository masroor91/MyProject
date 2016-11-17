package com.mas.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClientupdateWeatherTemp {

	public static void main(String[] args) {
		
		String uri="http://localhost:8080/RestCXFWeatherService/rest/weatherService/weatherService/updateWeatherTemp";
		WebClient client= WebClient.create(uri);
		
		Weather w = new Weather();
		w.setCityid(400);
		//w.setName("Chennai");
		w.setTemp(200);
		
		Response res=client.type(MediaType.APPLICATION_XML).put(w, Response.class);
		
		System.out.println("Status: " + res.getStatus());
		System.out.println("Response Message: " + res.readEntity(String.class));
		
	}

}
