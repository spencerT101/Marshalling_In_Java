package com.example.iwservice.controllers;

import com.example.iwservice.jsonerror.JsonError;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
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
public class CustomErrorController extends AbstractErrorController {

    private JsonError PATH = new JsonError(404, "Operation not found");

    @Autowired
    public CustomErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @ExceptionHandler(NotFoundException.class)
    public String notFound() {
        return "404";
    }

//    @RequestMapping()
//    public ResponseEntity<?> handleErrors(HttpServletRequest request) {
//        HttpStatus status = getStatus(request);
//
//        if (status.equals(HttpStatus.NOT_FOUND))
//            throw new NotFoundException();
//
//        return ResponseEntity.status(status).body(getErrorAttributes(request,false));
//    }

    @RequestMapping()
    public ResponseEntity <JsonError> handleError(HttpServletRequest request){

//        HttpStatus status = getStatus(request);

        return new ResponseEntity<>(PATH, HttpStatus.NOT_FOUND);
    }



    public JsonError getErrorPath() {
        return PATH;
    }

    }

