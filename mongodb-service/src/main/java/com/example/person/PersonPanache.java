package com.example.person;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.time.LocalDate;

@MongoEntity(collection = "Person")
public class PersonPanache extends PanacheMongoEntity {
    public String name;
    public LocalDate birth;
}
