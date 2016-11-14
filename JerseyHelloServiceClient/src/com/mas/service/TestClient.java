package com.mas.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClient {

	public static void main(String[] args) {
		Client client= Client.create();
		String uri="http://localhost:8080/JerseyHelloService/rest/helloService/sayHello/25?name1=Masroor";
		WebResource resource= client.resource(uri);
		
		String res= resource.get(String.class); //Parameter of get method should be return type
		System.out.println(res);
	}

}
