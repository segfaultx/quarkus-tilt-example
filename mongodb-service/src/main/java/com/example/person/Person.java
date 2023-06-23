package com.example.person;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@MongoEntity
public class Person extends PanacheMongoEntity {
    public ObjectId id; // used by MongoDB for the _id field
    public String name;
    public LocalDate birth;
}