package com.example;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface MongodbServiceRestClient {

    @POST
    @Path("/person")
    void createPerson();
}
