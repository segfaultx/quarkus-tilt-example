package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ExampleRestService {

    @RestClient
    ExampleRestClient restClient;

    public String getData() {
        return restClient.getExampleData("");
    }
}
