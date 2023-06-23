package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

@RegisterRestClient
public interface MongodbServiceRestClient {

    @POST
    @Path("/person")
    void createPerson();

    @GET
    @Path("/person")
    String getPersonByName(@RestQuery String name);
}
