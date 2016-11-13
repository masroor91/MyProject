 package com.mas.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ClientWithoutConfig {

	public static void main(String[] args) {
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		factory.setAddress("http://localhost:8080/ApacheCXFWeatherService/services/WeatherServicePort?wsdl");
		
		factory.setServiceClass(WeatherService.class);
		
		WeatherService service  =  (WeatherService) factory.create();
		
		Weather w= service.getWeatherByCityId(1);
		
		System.out.println("Temperature of the city " + w.getName() + " is " + w.getTemp());
		
	}

}
