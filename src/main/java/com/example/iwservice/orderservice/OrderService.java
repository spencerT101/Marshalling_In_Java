package com.example.iwservice.orderservice;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;

import java.util.ArrayList;

public class OrderService {

    public PurchaseOrder upDatePurchaseOrderCost(PurchaseOrder purchaseOrder){
        ArrayList<PurchaseOrderLine> purchaseOrderLine1 = purchaseOrder.getPurchaseOrderDetail().getPurchaseOrderLine();
        purchaseOrderLine1.forEach((purchaseOrderLine) -> purchaseOrderLine.setCost(purchaseOrderLine.getCost() * 1.23));
        return purchaseOrder;
    }
}
