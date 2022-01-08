package com.example.iwservice.jsonerror;

import java.util.Map;

public class JsonError {

    private int code;
    private  String message;

    public JsonError(int  code, final String message){
        this.code = code;
        this.message = message;

    }

//    public static JsonError froDefaultAttributeMap(final Map<String, Object> defaultErrorAttributes){
//        return new JsonError(
//                ((Integer) defaultErrorAttributes.get("status")),
//                (String) defaultErrorAttributes.getOrDefault("message", "no message available")
//        );
//
//    };

    public Integer getCode() {
        return code;
    }
    public String getMessage(){
        return message;
    }
}
