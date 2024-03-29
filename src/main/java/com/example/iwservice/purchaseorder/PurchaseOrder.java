package com.example.iwservice.purchaseorder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import com.example.iwservice.shippingaddress.ShippingAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;

@XmlRootElement(name = "PurchaseOrder")
public class PurchaseOrder {


    private String customerFirst;
    private String customerLast;
    private String company;
    private ShippingAddress shippingAddress;
    private PurchaseOrderDetail purchaseOrderDetail;
    private PurchaseOrderLine purchaseOrderLine;



    public PurchaseOrder(String customerFirst, String customerLast, String company, ShippingAddress shippingAddress, PurchaseOrderDetail purchaseOrderDetail) {
        this.customerFirst = customerFirst;
        this.customerLast = customerLast;
        this.company = company;
        this.shippingAddress = shippingAddress;
        this.purchaseOrderDetail = purchaseOrderDetail;

    }

    public PurchaseOrder(){

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


    @XmlElement(name = "PurchaseOrderDetail")
    public PurchaseOrderDetail getPurchaseOrderDetail(){
        return purchaseOrderDetail;
    }

    public void setPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail;
    }
}
