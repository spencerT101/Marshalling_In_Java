package com.example.iwservice.orderservice;
import com.example.iwservice.customer.Customer;

public class OrderService {

    public Customer upDateOrderAmount(Customer customer){
        customer.setOrderAmount(customer.getOrderAmount()*1.23);
        return customer;
    }
}
