package com.example.iwservice.orderservice;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;

import java.util.ArrayList;

public class OrderService {


    public PurchaseOrder upDatePurchaseOrderCost(PurchaseOrder purchaseOrder){
        ArrayList <PurchaseOrderLine> purchaseOrderLine1 = purchaseOrder.getPurchaseOrderDetail().getPurchaseOrderLine();
        PurchaseOrderDetail purchaseOrderDetail1 = purchaseOrder.getPurchaseOrderDetail().addPurchaseLine(purchaseOrderLine1);
        double updateCost = purchaseOrder.getPurchaseOrderLineCost(purchaseOrderLine);
        purchaseOrder.setPurchaseOrderLineCost(ArrayList purchaseOrderLine, updateCost * 1.23);
        return purchaseOrder;
    }
}
