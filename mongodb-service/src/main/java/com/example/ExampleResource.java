package com.example;

import com.example.person.Person;
import com.example.person.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/person")
public class ExampleResource {

    @Inject
    PersonService personService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void createPerson() {
        personService.createPerson();
    }

    @GET
    public Person getPersonByName(@RestQuery String name) {
        return personService.getPersonByName(name);
    }

    @GET
    @Path("/panache")
    public Person getPersonByNamePanache(@RestQuery String name) {
        return personService.getPersonByNamePanacheEntity(name);
    }
}
