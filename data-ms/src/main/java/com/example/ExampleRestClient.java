package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface ExampleRestClient {

    @GET
    @Path("/17")
    String getExampleData(@QueryParam("text") String text);
}
