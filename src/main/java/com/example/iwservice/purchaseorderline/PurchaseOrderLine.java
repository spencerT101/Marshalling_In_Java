package com.example.iwservice.purchaseorderline;

import javax.xml.bind.annotation.XmlElement;



public class PurchaseOrderLine{


    private String itemID;
    private String itemName;
    private String qty;

    public PurchaseOrderLine(String itemID, String itemName, String qty){
        this.itemID = itemID;
        this.itemName = itemName;
        this.qty = qty;
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

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
