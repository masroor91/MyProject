package com.mas.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.mas.com/", portName = "WeatherServicePort", serviceName = "WeatherServiceService")
public class WeatherService {
	
	WeatherDao weatherDao = new WeatherDao();
	
	public Weather getWeatherByCityId(int cityid){
		return weatherDao.getWeatherByCityId(cityid);
	}
	
	public int getTempByWeather(Weather w){
		return weatherDao.getTempByWeather(w);
	}
}
