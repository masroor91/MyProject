package com.mas.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientWithConfigFile {

	public static void main(String[] args) {
		
		//It should take client side config file into its argument
		ApplicationContext ctx= new ClassPathXmlApplicationContext("cxf.xml");
		
		//It should take the id value from cxf.xml's client tag
		CalService ws= (CalService) ctx.getBean("myclient");
		
		System.out.println("Result of Add is " + ws.add(10, 20));
	}

}
