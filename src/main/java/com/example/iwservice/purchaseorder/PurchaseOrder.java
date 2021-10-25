package com.example.iwservice.purchaseorder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import com.example.iwservice.shippingaddress.ShippingAddress;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
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
//
//    public  double getPurchaseOrderLineCost(PurchaseOrderLine purchaseOrderLine){
//         ArrayList cost = new ArrayList<>();
//         double newCost = purchaseOrderLine.getCost();
//         cost.add(newCost);
//         return ArrayList cost;
//    }
//
//    public void setPurchaseOrderLineCost(PurchaseOrderLine purchaseOrderLine, double newCost){
//          purchaseOrderLine.setCost(newCost);
//    }

    @XmlElement(name = "PurchaseOrderDetail")
    public PurchaseOrderDetail getPurchaseOrderDetail(){
        return purchaseOrderDetail;
    }

    public void setPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail;
    }
}
