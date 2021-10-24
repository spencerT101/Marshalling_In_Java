package com.example.iwservice.purchaseorderdetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


public class PurchaseOrderDetail {

    private ArrayList <PurchaseOrderLine> purchaseOrderLine;



    public PurchaseOrderDetail(ArrayList purchaseOrderLine){
          this.purchaseOrderLine = new ArrayList<>();

    }

    public PurchaseOrderDetail(){
    };

    @XmlElement(name = "PurchaseOrderLine")
    public ArrayList<PurchaseOrderLine> getPurchaseOrderLine() {
        return purchaseOrderLine;
    }

    public void setPurchaseOrderLine(ArrayList<PurchaseOrderLine> purchaseOrderLine) {
        this.purchaseOrderLine = purchaseOrderLine;
    }

    public int getPurchaseOrderLineSize(){
        return this.purchaseOrderLine.size();
    }
}
