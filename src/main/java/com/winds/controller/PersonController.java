package com.winds.controller;

import com.winds.domain.node.JsonNode;
import com.winds.domain.node.Person;
import com.winds.domain.relationship.JsonRelationship;
import com.winds.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/{name}")
    public JsonNode findByName(@PathVariable String name){
        Person person = personService.findByName(name);
        List<String> labels = new ArrayList<>();
        labels.add("Person");
        labels.add("Student");
        return null;
    }
//
//    @GetMapping("/all")
//    public List<JsonNode> finaAll(){
//        List<Person> persons = personService.findAll();
//        List<JsonNode> entities = new ArrayList<>();
//        for (Person person:persons){
//            entities.add(new JsonNode(person.getName(),1));
//        }
//        return entities;
//    }
//
//    @GetMapping("/{name}/actedIn")
//    public List<JsonRelationship> findActedByName(@PathVariable String name){
//        Person person = personService.findByName(name);
//        return null;
//    }

}
