package com.mas.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClientgetAllWeather {

	public static void main(String[] args) {
		
		String msg=null;
		String uri="http://localhost:8080/RestCXFWeatherService/rest/weatherService/weatherService/getAllWeather";
		
		WebClient client=WebClient.create(uri);
		int status=	client.get().getStatus();
		if (status==200){
			List<Weather> list= client.accept(MediaType.APPLICATION_XML).get(new GenericType<ArrayList<Weather>>(){});
			
			StringBuilder builder = new StringBuilder("=======================Weather=======================\n");
			for(Weather w:list){
				builder.append("City ID: ").append(w.getCityid()).append(", City Name: ").
				append(w.getName()).append(", Temperature: ").append(w.getTemp()).append("\n");
			}
			builder.append("=====================================================");
			 msg= builder.toString();
		}
		else{
			 msg= client.get(String.class);
		}
		
		System.out.println(msg);
	
	}

}
