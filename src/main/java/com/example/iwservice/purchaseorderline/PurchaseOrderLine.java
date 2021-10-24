package com.example.iwservice.purchaseorderline;

import javax.xml.bind.annotation.XmlElement;



public class PurchaseOrderLine{


    private String itemID;
    private String itemName;
    private String qty;
    private double cost;
    private String currency;

    public PurchaseOrderLine(String itemID, String itemName, String qty, double cost, String currency){
        this.itemID = itemID;
        this.itemName = itemName;
        this.qty = qty;
        this.cost= cost;
        this.currency = currency;
    }

    public PurchaseOrderLine(){

    };

    @XmlElement(name = "itemID")
    public String getItemID(){
        return itemID;
    }

    public void setItemID(String newItemID) {
        this.itemID = newItemID;
    }
    @XmlElement(name = "itemName")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @XmlElement(name = "qty")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @XmlElement(name = "cost")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
