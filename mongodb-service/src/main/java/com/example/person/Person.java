package com.example.person;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@MongoEntity
public class Person {
    public ObjectId _id;
    public String name;
    public LocalDate birth;
}