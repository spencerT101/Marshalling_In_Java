package com.example.iwservice.jsonerror;

import java.util.Map;

public class JsonError {

    private Integer code;
    private  String message;

    public JsonError(Integer  code, final String message){
        this.code = code;
        this.message = message;

    }

    public static JsonError froDefaultAttributeMap(final Map<String, Object> defaultErrorAttributes){
        return new JsonError(
                ((Integer) defaultErrorAttributes.get("status")),
                (String) defaultErrorAttributes.getOrDefault("message", "Operation not found")
        );

    };

    public Integer getCode() {
        return code;
    }
    public String getMessage(){
        return message;
    }
}
