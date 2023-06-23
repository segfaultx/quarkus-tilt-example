package com.example.person;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {

    public Person findByName(String name){
        return find("name", name).firstResult();
    }
}