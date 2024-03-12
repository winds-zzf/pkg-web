package com.winds.domain.relationship;

import com.winds.domain.node.Movie;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.lang.annotation.Target;

@RelationshipProperties
public class ActedIn {
    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private Movie movie;

    public ActedIn(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
