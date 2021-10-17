package com.example.iwservice.orderservice;
import com.example.iwservice.purchaseorder.PurchaseOrder;

public class OrderService {

    public PurchaseOrder upDateOrderAmount(PurchaseOrder purchaseOrder){
        purchaseOrder.setOrderAmount(purchaseOrder.getOrderAmount()*1.23);
        return purchaseOrder;
    }
}
