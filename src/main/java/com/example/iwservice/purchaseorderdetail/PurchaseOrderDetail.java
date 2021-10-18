package com.example.iwservice.purchaseorderdetail;

import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrderDetail {

    private PurchaseOrderLine purchaseOrderLine;

    public PurchaseOrderDetail(PurchaseOrderLine purchaseOrderLine){
          this.purchaseOrderLine = purchaseOrderLine;

    }

    public PurchaseOrderDetail(){

    };

    @XmlElement(name = "purchaseOrderLine")
    public PurchaseOrderLine getPurchaseOrderLine(){
        return purchaseOrderLine;
    }
}
