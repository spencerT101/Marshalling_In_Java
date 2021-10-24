package com.example.iwservice.orderservice;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;

public class OrderService {


    public PurchaseOrder upDateOrderAmount(PurchaseOrder purchaseOrder){
        PurchaseOrderLine purchaseOrderLine = purchaseOrder.getPurchaseOrderDetail().getPurchaseOrderLine();
        double updateCost = purchaseOrder.getPurchaseOrderLineCost(purchaseOrderLine);
        purchaseOrder.setPurchaseOrderLineCost(purchaseOrderLine, updateCost *1.23);
        return purchaseOrder;
    }
}
