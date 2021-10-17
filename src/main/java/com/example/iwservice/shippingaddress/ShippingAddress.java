package com.example.iwservice.shippingaddress;
import javax.xml.bind.annotation.XmlElement;


public class ShippingAddress {


    private String ShippingAddressLine1;
    private String ShippingAddressLine2;


    public ShippingAddress(String shippingAddressLine1, String shippingAddressLine2) {
        this.ShippingAddressLine1 = shippingAddressLine1;
        this.ShippingAddressLine2 = shippingAddressLine2;

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

    public String getShippingAddressLine2() {
        return ShippingAddressLine2;
    }

    public void setShippingAddressLine2(String shippingAddressLine2) {
        ShippingAddressLine2 = shippingAddressLine2;
    }
}


