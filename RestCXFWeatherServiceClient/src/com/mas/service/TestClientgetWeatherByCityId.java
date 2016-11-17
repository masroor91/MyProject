package com.mas.service;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

public class TestClientgetWeatherByCityId {

	public static void main(String[] args) {
		
		String msg=null;
		String uri="http://localhost:8080/RestCXFWeatherService/rest/weatherService/weatherService/getWeatherByCityId?cityid=200";
		
		WebClient client=WebClient.create(uri);
		int status=	client.get().getStatus();
		if (status==200){
			Weather w= client.accept("application/xml").get(Weather.class);
			
			StringBuilder builder = new StringBuilder("=======================Weather=======================\n");
			
				builder.append("City ID: ").append(w.getCityid()).append(", City Name: ").
				append(w.getName()).append(", Temperature: ").append(w.getTemp()).append("\n");
				
				builder.append("=====================================================");
			 
				msg= builder.toString();
		}
		else{
			 msg= client.get(String.class);
		}
		
		System.out.println(msg);

	}

}
