package com.example.iwservice.controllers;

import com.example.iwservice.jsonerror.JsonError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
@RestControllerAdvice
public class CustomErrorController  {
    private JsonError code;


    public ResponseEntity <JsonError> handleError(HttpServletRequest request){
        final JsonError error = new JsonError(
                code.getCode(),
                "Operation not found"

        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    }

