package com.mas.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employeeService")
public class EmployeeService {
	EmployeeServiceMethods serviceMethods = new EmployeeServiceMethods();
	
	@GET
	@Path("/getAllEmployee")
	@Produces("application/json")
	
	public Response getAllEmployee(){
		ArrayList<Employee> list= serviceMethods.getAllEmployee();
		
		GenericEntity<List<Employee>> generic = new GenericEntity<List<Employee>>(list){};
		return Response.status(201).entity(generic).build();
	}
	
	@GET
	@Path("/getEmployeeById/{eid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById(@PathParam("eid") int eid){
		return serviceMethods.getEmployeeById(eid);
	}
	
	@POST
	@Path("/createEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployee(Employee emp){
		Response res=null;
		int status=serviceMethods.createEmployee(emp);
		if (status>0){
			res=Response.status(200).entity("Object Employee inserted successfully").build();
		}
		else if(status==0){
			res= Response.status(202).entity("Employee with same id already present").build();
		}
		else{
			res= Response.status(201).entity("Object Employee inserion failed").build();
		}
		
		return res;
	}
	
	@GET
	@Path("/deleteEmployeeById")
	public Response deleteEmployeeById(@QueryParam("eid") int eid){
		Response res=null;
		int status= serviceMethods.deleteEmployeeById(eid);
		if (status>0){
			res=Response.status(200).entity("Employee with Emp id "+ eid + " deleted successfully").build();
		}
		else if (status==0){
			res= Response.status(201).entity("No Employee with Emp id "+ eid + " is present in Database").build();
		}
		else{
			res=Response.status(202).entity("Employee with Emp id " + eid+ " could be deleted due to some exception").build();
		}
		
		return res;
	}
	
	@DELETE
	@Path("/deleteEmployee")
	public Response deleteEmployee(Employee emp){
		Response res=null;
		int status= serviceMethods.deleteEmployee(emp);
		if (status>0){
			res=Response.status(200).entity("Employee with Emp id "+ emp.getEid() + " deleted successfully").build();
		}
		else if (status==0){
			res= Response.status(201).entity("No Employee with Emp id "+ emp.getEid() + " is present in Database").build();
		}
		else{
			res=Response.status(202).entity("Employee with Emp id " + emp.getEid()+ " could be deleted due to some exception").build();
		}
		
		return res;
	}
	
	@PUT
	@Path("/updateEmployeeSalary")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEmployeeSalary(Employee emp){
		Response res=null;
		int status= serviceMethods.updateEmployeeSalary(emp);
		if (status>0){
			res=Response.status(200).entity("Salary of Employee with Emp id "+ emp.getEid()+ " updated successfully").build();
		}
		else if (status==0){
			res= Response.status(201).entity("No Employee with Emp id "+ emp.getEid() + " is present in Database").build();
		}
		else{
			res=Response.status(202).entity("Salary of Employee with Emp id " + emp.getEid()+ " could be updated due to some exception").build();
		}
		return res;
	}
	
	@GET
	@Path("/updateEmployeeSalaryById")
	public Response updateEmployeeSalaryById(@QueryParam("eid") int eid, @QueryParam("salary") int salary){
		Response res=null;
		int status= serviceMethods.updateEmployeeSalaryById(eid, salary);
		if (status>0){
			res=Response.status(200).entity("Salary of Employee with Emp id "+ eid + " is updated successfully with new Salary " + salary).build();
		}
		else if (status==0){
			res= Response.status(201).entity("No Employee with Emp id "+ eid + " is present in Database").build();
		}
		else{
			res=Response.status(202).entity("Salary of Employee with Emp id " + eid+ " could not be updated with new salary due to some exceptions").build();
		}
		return res;
	}
}
