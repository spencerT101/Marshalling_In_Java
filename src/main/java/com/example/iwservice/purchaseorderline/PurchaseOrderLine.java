package com.example.iwservice.purchaseorderline;

import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrderLine {

    private String itemID;

    public PurchaseOrderLine(String itemID){ 
        this.itemID = itemID;
    }

    public PurchaseOrderLine(){

    };

    @XmlElement(name = "ItemID")
    public String getItemID(){
        return itemID;
    }

    public void setItemID(String newItemID) {
        this.itemID = newItemID;
    }
}
