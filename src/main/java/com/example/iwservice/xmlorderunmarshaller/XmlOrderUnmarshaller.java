package com.example.iwservice.xmlorderunmarshaller;

import com.example.iwservice.purchaseorder.PurchaseOrder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlOrderUnmarshaller {

    public PurchaseOrder unmarshal(String purchaseOrderRaw) throws JAXBException {


        JAXBContext jc = JAXBContext.newInstance(PurchaseOrder.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        PurchaseOrder purchaseOrder = (PurchaseOrder) unmarshaller.unmarshal(new StringReader(purchaseOrderRaw));

        return purchaseOrder;
    }
}
