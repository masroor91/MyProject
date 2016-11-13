package com.mas.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientWithConfigFile {

	public static void main(String[] args) {
		
		//It should take client side config file into its argument
		ApplicationContext ctx= new ClassPathXmlApplicationContext("cxf.xml");
		
		//It should take the id value from cxf.xml's client tag
		WeatherService ws= (WeatherService) ctx.getBean("myclient");
		
		Weather w= ws.getWeatherByCityId(1);
		System.out.println("Temperature of the city "+ w.getName() + " is " + w.getTemp());
	}

}
