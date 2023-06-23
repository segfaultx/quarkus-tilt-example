package com.example.person;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.LocalDate;
import java.util.Random;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepository;

    public void createPerson() {
        var person = new Person();

        person.name = "test %d".formatted(new Random().nextInt(100));
        person.birth = LocalDate.now();

        personRepository.persist(person);
    }

    public Person getPersonByName(String name) {
        return personRepository.findByName(name);
    }
}
