package com.example.iwservice.customer;
import com.example.iwservice.shippingaddress.ShippingAddress;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {


    private String customerFirst;
    private String customerLast;
    private String company;
    private double orderAmount;
    private ShippingAddress shippingAddress;


    public Customer(String customerFirst, String customerLast, String company, double orderAmount, ShippingAddress shippingAddress) {
        this.customerFirst = customerFirst;
        this.customerLast = customerLast;
        this.company = company;
        this.orderAmount = orderAmount;
        this.shippingAddress = shippingAddress;
    }

    public Customer(){

    }


    @XmlElement(name = "CustomerFirst")
    public String getCustomerFirst() {
        return customerFirst;
    }

    public void setCustomerFirst(String customerFirst) {
        this.customerFirst = customerFirst;
    }

    @XmlElement(name = "CustomerLast")
    public String getCustomerLast() {
        return customerLast;
    }

    public void setCustomerLast(String customerLast) {
        this.customerLast = customerLast;
    }

    @XmlElement(name = "Company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @XmlElement(name = "ShippingAddress")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @XmlElement(name = "OrderAmount")
    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
