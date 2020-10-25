package com.jakartapost;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/FormPost")
public class FormPost {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")

	public String testMethodPost(@FormParam("name") String name,
								 @FormParam("address") String address,
								 @FormParam("phoneNumber") Long phoneNumber){
		return name + " - " + address + " - " + phoneNumber;
	}
}
