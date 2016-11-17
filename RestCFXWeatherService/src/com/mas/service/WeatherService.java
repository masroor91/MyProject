package com.mas.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/weatherService")
public class WeatherService {
	
	WeatherDao weatherDao;

	public WeatherDao getWeatherDao() {
		return weatherDao;
	}

	public void setWeatherDao(WeatherDao weatherDao) {
		this.weatherDao = weatherDao;
	}
	

	@GET
	@Path("/getAllWeather")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllWeather(){
		Response res=null;
		List<Weather> list = weatherDao.getAllWeather();
		if (list!=null){
			GenericEntity<List<Weather>> generic = new GenericEntity<List<Weather>>(list){};
			res =Response.status(200).entity(generic).build();
		}
		else{
			res= Response.status(201).entity("No records are present in the database").build();
		}
		return res;
	}
	
	@GET
	@Path("/getWeatherByCityId")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getWeatherByCityId(@QueryParam("cityid") int cityid ){
		Response res=null;
		Weather w= weatherDao.getWeatherByCityId(cityid);
		if (w!=null){
			res= Response.status(200).entity(w).build();
		}
		else{
			res= Response.status(201).entity("No records are present with cityID " + cityid + " in the database").build();
		}
		return res;	
	}
	
	@GET
	@Path("/getWeatherByCityName")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getWeatherByCityId(@QueryParam("cityname") String cityid ){
		Response res=null;
		Weather w= weatherDao.getWeatherByCity(cityid);
		if (w!=null){
			res= Response.status(200).entity(w).build();
		}
		else{
			res= Response.status(201).entity("No records are present with cityID " + cityid + " in the database").build();
		}
		return res;	
	}
	
	
	@POST
	@Path("/createWeather")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createWeather(Weather w){
		Response res=null;
		
		int flag=weatherDao.createWeather(w);
		if(flag>0){
			res= Response.status(200).entity("Weather Object inserted into Database to successfully").build();
		}
		else if(flag==0){
			res= Response.status(201).entity("Weather Object insertion failed").build();
		}
		else{
			res = Response.status(202).entity("SQL Exception Ocurred").build();
		}
		return res;
	}
	
	@GET
	@Path("/deleteWeatherByCityId/{cityid}")
	public Response deleteWeatherByCityId(@PathParam("cityid") int cityid){
		Response res= null;
		int flag=weatherDao.deleteWeatherByCityId(cityid);
		if(flag>0){
			res= Response.status(200).entity("Weather with city id " + cityid+" deleted from Database successfully").build();
		}
		else if(flag==0){
			res= Response.status(201).entity("Weather with city id " + cityid+" is not present in the database ").build();
		}
		else{
			res = Response.status(202).entity("Weather with city id " + cityid+" could not be deleted due to some internal problem").build();
		}
		
		return res;
	}
	
	@GET
	@Path("/updateWeatherTempByCityId")
	public Response updateWeatherTempByCityId(@QueryParam("cityid") int cityid, @QueryParam("temp") int temp){
		Response res=null;
		int flag= weatherDao.updateWeatherTempByCityId(cityid, temp);
		
		if(flag>0){
			res= Response.status(200).entity("Temperature of City id " + cityid+ " in Weather table is updated with temperature " + temp).build();
		}
		else if (flag==0){
			res= Response.status(201).entity("Weather with city id " + cityid+" is not present in the database ").build();
		}
		else{
			res = Response.status(202).entity("Weather with city id " + cityid+" could not be updated due to some internal problem").build();
		}
		return res;
	}
	
	@GET
	@Path("/updateWeatherTemp")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateWeatherTemp(Weather w){
		Response res=null;
		int flag= weatherDao.updateWeatherTemp(w);
		int cityid=w.getCityid();
		int temp=w.getTemp();
		if(flag>0){
			res= Response.status(200).entity("Temperature of City id " + cityid+ " in Weather table is updated with temperature " + temp).build();
		}
		else if (flag==0){
			res= Response.status(201).entity("Weather with city id " + cityid+" is not present in the database ").build();
		}
		else{
			res = Response.status(202).entity("Weather with city id " + cityid+" could not be updated due to some internal problem").build();
		}
		
		return res;
	}

}
