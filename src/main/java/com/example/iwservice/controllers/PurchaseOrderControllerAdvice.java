package com.example.iwservice.controllers;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import com.example.iwservice.purchaseorder.PurchaseOrder;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@ControllerAdvice()
public class PurchaseOrderControllerAdvice implements ErrorController {

//    PurchaseOrderController purchaseOrderController = new PurchaseOrderController();
//    PurchaseOrder purchaseOrder;

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> handleNoHandlerFoundException(HttpServletRequest request, Throwable ex) throws IOException {
        HttpStatus status = getStatus(request);
//      if(status == HttpStatus.NOT_FOUND){
        String PATH = "src/main/resources/sample404ErrorOutput.json";
        String content = new String (Files.readAllBytes(Paths.get(PATH)));
        return new ResponseEntity<>(content, status);
        }
//      return ResponseEntity<>(HttpStatus.FOUND);
//    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer code = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus status = HttpStatus.resolve(code);
        return (status != null) ? status : HttpStatus.INTERNAL_SERVER_ERROR;
    }

}

