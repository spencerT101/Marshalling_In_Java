package com.example.iwservice.controllers;
import javax.servlet.RequestDispatcher;
        import javax.servlet.http.HttpServletRequest;

        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@ControllerAdvice()
public class PurchaseOrderControllerAdvice {

//    @ResponseBody
//    @Override
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> handleNoHandlerFoundException(HttpServletRequest request, Throwable ex) throws IOException {
        HttpStatus status = getStatus(request);
        String PATH = "src/main/resources/sample404ErrorOutput.json";
        String content = new String ( Files.readAllBytes( Paths.get(PATH) ) );
        return new ResponseEntity<>(content, status);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer code = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus status = HttpStatus.resolve(code);
        return (status != null) ? status : HttpStatus.INTERNAL_SERVER_ERROR;
    }

}

