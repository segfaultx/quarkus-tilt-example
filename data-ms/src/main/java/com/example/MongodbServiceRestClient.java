package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/person")
@RegisterRestClient
public interface MongodbServiceRestClient {

    @POST
    void createPerson();

    @GET
    Person getPersonByName(@RestQuery String name);

    @GET
    @Path("/panache")
    Person getPersonByNamePanache(@RestQuery String name);
}
