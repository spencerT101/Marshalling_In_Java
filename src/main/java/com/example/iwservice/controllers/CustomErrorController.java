package com.example.iwservice.controllers;

import com.example.iwservice.jsonerror.JsonError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @Value("$(debug)")
    private boolean debug;

    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(value = PATH)
    public JsonError error(HttpServletRequest request, HttpServletResponse response){
        return new JsonError(response.getStatus(), errorAttributes.getErrorAttributes(request, debug));
    }

    @Override
    public String getErrorPath(){
        return PATH;
    }
    private Map<String, Object> getErrorAttributes(HttpServletRequest request){
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return errorAttributes.getErrorAttributes(requestAttributes);
    }
}
