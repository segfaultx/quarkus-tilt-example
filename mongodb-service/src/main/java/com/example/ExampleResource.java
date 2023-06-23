package com.example;

import com.example.person.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/person")
public class ExampleResource {

    @Inject
    PersonService personService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void createPerson() {
        personService.createPerson();
    }
}
