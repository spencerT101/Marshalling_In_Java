package com.example.iwservice.shippingaddress;
import javax.xml.bind.annotation.XmlElement;


public class ShippingAddress {


    private String ShippingAddressLine1;
    private String ShippingAddressLine2;
    private String City;
    private String PostCode;
    private String Country;


    public ShippingAddress(String shippingAddressLine1, String shippingAddressLine2, String city, String postCode, String country) {
        this.ShippingAddressLine1 = shippingAddressLine1;
        this.ShippingAddressLine2 = shippingAddressLine2;
        this.City = city;
        this.PostCode = postCode;
        this.Country = country;
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

    @XmlElement(name = "ShippingAddressLine2")
    public String getShippingAddressLine2() {
        return ShippingAddressLine2;
    }

    public void setShippingAddressLine2(String shippingAddressLine2) {
        this.ShippingAddressLine2 = shippingAddressLine2;
    }

    @XmlElement(name = "City")
    public String getCity() {
        return City;
    }

    public void setCity(String newCity) {
        this.City = newCity;
    }

    @XmlElement(name = "Postcode")
    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String newPostCode) {
        this.PostCode = newPostCode;
    }

    public String getCountry() {
        return Country;
    }
}


