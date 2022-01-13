package com.example.iwservice.controllers;

import com.example.iwservice.purchaseorder.PurchaseOrder;
import org.apache.tomcat.jni.File;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RestController
public class CustomErrorController implements ErrorController {

//    public String getErrorPath(){
//
//        return "src/main/resources";
//    }

    @RequestMapping("src/resources")
    public String handleError(HttpServletRequest request, Model model){

         String  PATH = "src/main/resources/sample404ErrorOutput.json";

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()){
                return PATH;
            }
        }

            return PATH;

    }
}
