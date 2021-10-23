package com.example.iwservice.purchaseorderline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;


public class PurchaseOrderLine{


    private String itemID;

    public PurchaseOrderLine(String itemID){
        this.itemID = itemID;
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
}
