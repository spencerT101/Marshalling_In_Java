package com.example.iwservice.orderservice;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;

import java.util.ArrayList;

public class OrderService {


    public PurchaseOrder upDatePurchaseOrderCost(PurchaseOrder purchaseOrder){
        ArrayList <PurchaseOrderLine> purchaseOrderLine = purchaseOrder.getPurchaseOrderDetail().getPurchaseOrderLine();
        double updateCost = purchaseOrder.getPurchaseOrderLineCost();
        purchaseOrder.setPurchaseOrderLineCost(purchaseOrderLine, updateCost * 1.23);
        return purchaseOrder;
    }
}
