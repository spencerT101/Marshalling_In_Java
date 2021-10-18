package com.example.iwservice.purchaseorderdetail;

import com.example.iwservice.purchaseorder.PurchaseOrder;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrderDetail {
      private String Detail;
//    private PurchaseOrderLine purchaseOrderLine;

    public PurchaseOrderDetail(String detail){
          this.Detail = detail;

    }


    public String getDetail(){
        return Detail;
    }
}
