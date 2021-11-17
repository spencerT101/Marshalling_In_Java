package com.example.iwservice.controllers;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.orderservice.OrderService;
import com.example.iwservice.schemavalidation.SchemaValidation;
import com.example.iwservice.xmlorderunmarshaller.XmlOrderUnmarshaller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;

@RestController
public class PurchaseOrderController {

    private OrderService orderService = new OrderService();
    private SchemaValidation schemaValidation = new SchemaValidation();
    private XmlOrderUnmarshaller xmlOrderUnmarshaller = new XmlOrderUnmarshaller();


    @RequestMapping(value = "/order/json")
    public PurchaseOrder getPurchaseOrderJson(@RequestBody() String purchaseOrderRaw) throws JAXBException, IOException, SAXException {
//        schemaValidation.validate( purchaseOrderRaw, "src/main/resources/schema.xsd");
        PurchaseOrder purchaseOrder = xmlOrderUnmarshaller.unmarshal(purchaseOrderRaw);
        orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }

    @RequestMapping(value = "/order/xml", produces = {MediaType.APPLICATION_XML_VALUE})
    public PurchaseOrder getPurchaseOrderXml(@RequestBody() PurchaseOrder purchaseOrder){
        purchaseOrder =  orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }
}
