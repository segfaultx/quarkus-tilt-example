package com.example.person;

import io.quarkus.mongodb.panache.common.MongoEntity;

import java.time.LocalDate;

@MongoEntity
public class Person {
    public String name;
    public LocalDate birth;
}