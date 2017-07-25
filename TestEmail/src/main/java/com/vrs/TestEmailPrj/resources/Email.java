package com.vrs.TestEmailPrj.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Param;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.vrs.TestEmailPrj.ConfigMConfiguration;

@Path("/sendEmailTest")
public class Email {
	private ConfigMConfiguration conf;

	public Email(ConfigMConfiguration configuration) {
		// TODO Auto-generated constructor stub
		this.conf = configuration;		
	}
	
@GET
@Timed
@ExceptionMetered
@Produces(MediaType.APPLICATION_JSON)
public String sendEmailTest(@QueryParam("emailid") final String c_email,@QueryParam("sub") final String c_sub,@QueryParam("msg") final String c_msg){
	
	return c_email+""+c_sub+""+c_msg;	
}	
	
}
