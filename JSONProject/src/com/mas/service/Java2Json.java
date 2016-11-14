package com.mas.service;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Java2Json {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Student student= new Student(100, "Venkat", 400);
		
		Address address = new Address(101, "Nitin Residency", "Hyderabad");
		
		student.setAddress(address);
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(new File("Student.json"), student);
		
		System.out.println("JSON of student object is generated...");
		
	}

}
