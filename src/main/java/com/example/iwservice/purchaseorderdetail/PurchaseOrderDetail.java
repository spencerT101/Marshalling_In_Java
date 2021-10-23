package com.example.iwservice.purchaseorderdetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class PurchaseOrderDetail {

    private PurchaseOrderLine purchaseOrderLine;


    public PurchaseOrderDetail(PurchaseOrderLine purchaseOrderLine){
          this.purchaseOrderLine = purchaseOrderLine;

    }

    public PurchaseOrderDetail(){
    };

    @XmlElement(name = "PurchaseOrderLine")
    public PurchaseOrderLine getPurchaseOrderLine(){
        return purchaseOrderLine;
    }

    public void setPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
        this.purchaseOrderLine = purchaseOrderLine;
    }
}
