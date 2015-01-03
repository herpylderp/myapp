package com.me.myapp.server

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/myapp")
@Produces(MediaType.APPLICATION_JSON)
class MyAppResource {
	@GET
	@Path("/dosomething")
	Response doSomething() {
		Response.ok().build()
	}
}