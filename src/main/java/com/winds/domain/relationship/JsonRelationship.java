package com.winds.domain.relationship;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class JsonRelationship {
    private Long id;
    private Long target;
    private Map<String,String> properties;
}