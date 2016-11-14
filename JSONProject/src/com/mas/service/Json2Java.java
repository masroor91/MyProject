package com.mas.service;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Json2Java {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Student std= mapper.readValue(new File("Student.json"), Student.class);
		
		System.out.println(std.getSid());
		System.out.println(std.getName());
		System.out.println(std.getMarks());
		
		System.out.println(std);
		
		Address add= std.getAddress();
		
		System.out.println(add.getFlatno());
		System.out.println(add.getBuildingName());
		System.out.println(add.getArea());
		
		System.out.println(add);

	}

}
