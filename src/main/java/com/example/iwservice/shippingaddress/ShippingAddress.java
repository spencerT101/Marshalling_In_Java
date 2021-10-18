package com.example.iwservice.shippingaddress;
import javax.xml.bind.annotation.XmlElement;


public class ShippingAddress {


    private String shippingAddressLine1;
    private String shippingAddressLine2;
    private String city;
    private String postCode;
    private String country;


    public ShippingAddress(String shippingAddressLine1, String shippingAddressLine2, String city, String postCode, String country) {
        this.shippingAddressLine1 = shippingAddressLine1;
        this.shippingAddressLine2 = shippingAddressLine2;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public ShippingAddress(){

    }

    @XmlElement(name = "ShippingAddressLine1")
    public String getShippingAddressLine1() {
        return shippingAddressLine1;
    }

    public void setShippingAddressLine1(String shippingAddressLine1) {
        this.shippingAddressLine1 = shippingAddressLine1;
    }

    @XmlElement(name = "ShippingAddressLine2")
    public String getShippingAddressLine2() {
        return shippingAddressLine2;
    }

    public void setShippingAddressLine2(String shippingAddressLine2) {
        this.shippingAddressLine2 = shippingAddressLine2;
    }

    @XmlElement(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    @XmlElement(name = "Postcode")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String newPostCode) {
        this.postCode = newPostCode;
    }

    @XmlElement(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String newCountry) {
        this.country = newCountry;
    }
}


