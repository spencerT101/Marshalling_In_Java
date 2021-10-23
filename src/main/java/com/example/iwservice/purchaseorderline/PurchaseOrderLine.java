package com.example.iwservice.purchaseorderline;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;


public class PurchaseOrderLine{


    private int itemID;
    private String itemName;

    public PurchaseOrderLine(int itemID, String itemName){
        this.itemID = itemID;
        this.itemName = itemName;
    }

    public PurchaseOrderLine(){

    };

    @XmlElement(name = "itemID")
    public int getItemID(){
        return itemID;
    }

    public void setItemID(int newItemID) {
        this.itemID = newItemID;
    }
    @XmlElement(name = "itemName")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
