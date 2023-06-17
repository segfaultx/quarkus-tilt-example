package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface GoodbyeMsRestClient {

    @GET
    @Path("/goodbye")
    String getGoodbyeText();
}
