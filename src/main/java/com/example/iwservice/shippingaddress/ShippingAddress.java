package com.example.iwservice.shippingaddress;
import javax.xml.bind.annotation.XmlElement;


public class ShippingAddress {


    private String ShippingAddressLine1;

    public ShippingAddress(String shippingAddressLine1) {
        this.ShippingAddressLine1 = shippingAddressLine1;

    }
    public ShippingAddress(){

    }

    @XmlElement(name = "ShippingAddressLine1")
    public String getShippingAddressLine1() {
        return ShippingAddressLine1;
    }

    public void setShippingAddressLine1(String shippingAddressLine1) {
        this.ShippingAddressLine1 = shippingAddressLine1;
    }
}


