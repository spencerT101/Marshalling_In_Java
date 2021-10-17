package com.example.iwservice.controllers;
import com.example.iwservice.customer.Customer;
import com.example.iwservice.orderservice.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private OrderService orderService = new OrderService();


    @RequestMapping(value = "/order/json")
    public Customer getCustomerOrderJson(@RequestBody() Customer customer){
        customer =  orderService.upDateOrderAmount(customer);
        return customer;
    }

    @RequestMapping(value = "/order/xml", produces = {MediaType.APPLICATION_XML_VALUE})
    public Customer getCustomerOrderXml(@RequestBody() Customer customer){
        customer =  orderService.upDateOrderAmount(customer);
        return customer;
    }



}
