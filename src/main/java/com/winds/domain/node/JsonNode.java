package com.winds.domain.node;
import lombok.Data;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Data
public class JsonNode {
    private Long id;  // element id
    private List<String> labels;  // labels
    private Map<String,String> properties;    // properties
    public JsonNode(Object obj){
        Field[] fields = obj.getClass().getDeclaredFields();
        try {
            for (Field field:fields) {
                // 设置允许通过反射访问私有变量
                field.setAccessible(true);
                properties.put(field.getName(),field.get(obj).toString());
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.id = obj.getId();
    }
}
