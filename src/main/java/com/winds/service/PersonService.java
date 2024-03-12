package com.winds.service;

import com.winds.domain.node.Person;

import java.util.List;

public interface PersonService {
    Person findByName(String name);
    List<Person> findAll();
}
