package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ExampleRestService {

    @RestClient
    ExampleRestClient restClient;

    @RestClient
    GoodbyeMsRestClient goodbyeMsRestClient;

    @RestClient
    MongodbServiceRestClient mongodbServiceRestClient;

    public String getData() {
        return restClient.getExampleData("");
    }

    public String getGoodbyeMsData() {
        return goodbyeMsRestClient.getGoodbyeText();
    }

    public void createPerson() {
        mongodbServiceRestClient.createPerson();
    }
}
