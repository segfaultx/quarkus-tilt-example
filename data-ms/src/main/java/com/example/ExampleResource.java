package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class ExampleResource {

    @Inject
    ExampleRestService exampleRestService;

    @GET
    @Path("/example")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return exampleRestService.getData();
    }
}