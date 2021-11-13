package com.example.iwservice.controllers;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.orderservice.OrderService;
import com.example.iwservice.schemavalidation.SchemaValidation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import java.io.IOException;

@RestController
public class PurchaseOrderController {

    private OrderService orderService = new OrderService();
    private SchemaValidation schemaValidation;
    private String validationFile = "schema.xsd";


    @RequestMapping(value = "/order/json")
    public PurchaseOrder getPurchaseOrderJson(@RequestBody() PurchaseOrder purchaseOrder) throws IOException, SAXException {
        schemaValidation.validate( "PurchaseOrder", "resources/schema.xsd");
        purchaseOrder =  orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }

    @RequestMapping(value = "/order/xml", produces = {MediaType.APPLICATION_XML_VALUE})
    public PurchaseOrder getPurchaseOrderXml(@RequestBody() PurchaseOrder purchaseOrder){
        purchaseOrder =  orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }
}
