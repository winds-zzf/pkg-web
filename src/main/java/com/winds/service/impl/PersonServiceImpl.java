package com.winds.service.impl;


import com.winds.domain.node.Person;
import com.winds.repository.PersonRepository;
import com.winds.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findByName(String name) {
        System.out.println(name);
        return personRepository.findByName(name);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
