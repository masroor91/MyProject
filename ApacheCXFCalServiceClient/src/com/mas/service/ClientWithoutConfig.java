package com.mas.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ClientWithoutConfig {

	public static void main(String[] args) {
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		factory.setAddress("http://localhost:8080/ApcaheCXFCalService/services/CalServicePort?wsdl");
		
		factory.setServiceClass(CalService.class);
		
		CalService service  =  (CalService) factory.create();
		
		System.out.println("Result of Add is "+ service.add(20, 30));
	}

}
