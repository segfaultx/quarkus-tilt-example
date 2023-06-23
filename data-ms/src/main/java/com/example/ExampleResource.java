package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

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

    @GET
    @Path("/goodbye")
    @Produces(MediaType.TEXT_PLAIN)
    public String getGoodbyeMsData() {
        return exampleRestService.getGoodbyeMsData();
    }

    @POST
    @Path("/person")
    public void createPerson() {
        exampleRestService.createPerson();
    }

    @GET
    @Path("/person")
    public Person getPersonByName(@RestQuery String name) {
        return exampleRestService.getPersonByName(name);
    }
}
