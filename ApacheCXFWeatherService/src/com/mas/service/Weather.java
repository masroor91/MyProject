package com.mas.service;

public class Weather {
	private int cityid;
	private String name;
	private int temp;
	
	public Weather(int cityid, String name, int temp) {
		super();
		this.cityid = cityid;
		this.name = name;
		this.temp = temp;
	}
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return getCityid() + "--" + getName() + "--" + getTemp();
	}
	
	
}
