package com.mas.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/helloService")
public class HelloService {
	
	
	@Path("/sayHello/{age}")
	@GET
	public String sayHello(@QueryParam("name1") String name, @PathParam("age") int age){
		return "Hello.... " + name + " Your Age is " + age;
	}
}
