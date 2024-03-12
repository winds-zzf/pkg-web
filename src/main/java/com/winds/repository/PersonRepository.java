package com.winds.repository;

import com.winds.domain.node.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends Neo4jRepository<Person,Long> {
    Person findByName(String name);

    @Override
    List<Person> findAll();
}
