package com.example.iwservice.jsonerror;

import java.util.Map;

public class JsonError {

    private Integer code;
    private String message;

    public JsonError(int code, Map<String, Object> errorAttributes){
        this.code = code;
        this.message = (String) errorAttributes.get("message");

    }

    public Integer getCode() {
        return code;
    }
    public String getMessage(){
        return message;
    }
}
