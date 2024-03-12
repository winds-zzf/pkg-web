package com.winds.domain.node;

import com.winds.domain.relationship.ActedIn;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Node
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Property(name="name")
    private String name;

    @Property(name="born")
    private Long born;

    /*
     * need to create an instance
     */
    @Relationship(type="ACTED_IN",direction= Relationship.Direction.OUTGOING)
    private List<ActedIn> actedIns;

    public Person(String name, Long born) {
        this.name = name;
        this.born = born;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBorn() {
        return born;
    }

    public void setBorn(Long born) {
        this.born = born;
    }

    public List<ActedIn> getActedIns() {
        return actedIns;
    }

    public void setActedIns(List<ActedIn> actedIns) {
        this.actedIns = actedIns;
    }
}
