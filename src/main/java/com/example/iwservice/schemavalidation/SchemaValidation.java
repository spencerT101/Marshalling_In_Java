package com.example.iwservice.schemavalidation;

import com.example.iwservice.purchaseorder.PurchaseOrder;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class SchemaValidation {

    public static void main(String[] args) {
        try{
            validate("resources/schema.xsd", "PurchaseOrder.xml");
        } catch (SAXException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void validate(String xmlFile, String validationFile) throws SAXException, IOException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        schemaFactory.newSchema(new File(validationFile)).newValidator().validate(new StreamSource(new File(xmlFile)));
    }

}
