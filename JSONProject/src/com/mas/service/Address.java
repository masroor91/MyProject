package com.mas.service;

public class Address {
	private int flatno;
	private String buildingName;
	private String area;
	
	public Address(int flatno, String buildingName, String area) {
		super();
		this.flatno = flatno;
		this.buildingName = buildingName;
		this.area = area;
	}
	
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address: {getFlatno()=" + getFlatno() + ", getBuildingName()=" + getBuildingName() + ", getArea()="
				+ getArea() + "}";
	}
	
	
}
