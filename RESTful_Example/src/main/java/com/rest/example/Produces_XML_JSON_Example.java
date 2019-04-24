package com.rest.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("produceboth")
public class Produces_XML_JSON_Example {
	@Path("both")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Student getBothResponse() {
		Student s = new Student();
		s.setAge(10);
		s.setName("XML AND JSON");
		return s;
	}
}
