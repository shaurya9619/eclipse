package com.lti.resource;


import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloResource {
	//http://localhost:9191/RESTApp/api/hello
	/*@GET
	public String hello() {
		return "hello jax-rs";
	}*/
	
	
	/*http://localhost:9191/RESTApp/api/hello?name=sau
	@GET
	public String hello(@QueryParam("name") String name) {
		return ("hello "+ name + "welcome");
	}*/
	/*
	 /*http://localhost:9191/RESTApp/api/hello/sau
	
	@Path("/{name}")
	@GET
	public String hello(@PathParam("name") String name) {
		return ("hello "+ name + "welcome");
	}*/
	
	
	//http://localhost:9191/RESTApp/api/hello;name=sau
	
	@GET
	public String hello(@MatrixParam("name") String name) {
		return ("hello "+ name + "welcome");
	}

}
