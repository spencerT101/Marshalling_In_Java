package com.example.iwservice.controllers;
import com.example.iwservice.jsonerror.JsonError;
import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.orderservice.OrderService;
import com.example.iwservice.schemavalidation.SchemaValidation;
import com.example.iwservice.xmlorderunmarshaller.XmlOrderUnmarshaller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.NoSuchElementException;

@RestController
public class PurchaseOrderController {

    private OrderService orderService = new OrderService();
    private SchemaValidation schemaValidation = new SchemaValidation();
    private XmlOrderUnmarshaller xmlOrderUnmarshaller = new XmlOrderUnmarshaller();



    @RequestMapping(value = "/order/json", method = RequestMethod.POST)
    public PurchaseOrder getPurchaseOrderJson(@RequestBody() String purchaseOrderRaw) throws JAXBException, IOException, SAXException {
        schemaValidation.validate( purchaseOrderRaw, "src/main/resources/schema.xsd");
        PurchaseOrder purchaseOrder = xmlOrderUnmarshaller.unmarshal(purchaseOrderRaw);
        orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }

    @RequestMapping(value = "/order/xml", method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_XML_VALUE})
    public PurchaseOrder getPurchaseOrderXml(@RequestBody() String purchaseOrderRaw) throws JAXBException, IOException, SAXException {
        schemaValidation.validate( purchaseOrderRaw, "src/main/resources/schema.xsd");
        PurchaseOrder purchaseOrder = xmlOrderUnmarshaller.unmarshal(purchaseOrderRaw);
        orderService.upDatePurchaseOrderCost(purchaseOrder);
        return purchaseOrder;
    }

//    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public JsonError handleNoSuchElementException(NoSuchElementException exception){
        JsonError error = new JsonError(404, "Operation not found");
        return error;
    }

}
