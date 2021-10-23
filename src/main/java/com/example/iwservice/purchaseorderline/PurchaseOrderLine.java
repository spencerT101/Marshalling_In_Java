package com.example.iwservice.purchaseorderline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;


public class PurchaseOrderLine{


    private String itemID;
    private String itemName;

    public PurchaseOrderLine(String itemID, String itemName){
        this.itemID = itemID;
        this.itemName = itemName;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}