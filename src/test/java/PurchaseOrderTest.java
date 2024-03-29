import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PurchaseOrderTest {
    private PurchaseOrder purchaseOrder1;
    private ShippingAddress shippingAddress1;
    private PurchaseOrderDetail purchaseOrderDetail1;
    private PurchaseOrderLine purchaseOrderLine1;
    private String newFirstName;
    private String newLastName;
    private String newCompanyName;
    private double newCost1;
    private ArrayList<PurchaseOrderLine> purchaseOrderLines;


    @Before
    public void setup(){
        purchaseOrder1 = new PurchaseOrder("John", "Doe", "Fake Company Pty Ltd", shippingAddress1, purchaseOrderDetail1);
        shippingAddress1 = new ShippingAddress("123 Fake St", "Fake Building", "London", "UN0 0NO", "UK");
        purchaseOrderDetail1 = new PurchaseOrderDetail(purchaseOrderLines);
        purchaseOrderLine1 = new PurchaseOrderLine("123456", "Fake Product","1", 100, "GBP");
    }

    @Test
    public void canGetPurchaseOrderCustomerFirstName(){
        assertEquals("John", purchaseOrder1.getCustomerFirst());
    }

    @Test
    public void canSetPurchaseOrderCustomerFirstName(){
       newFirstName = "Pete";
       purchaseOrder1.setCustomerFirst(newFirstName);
       assertEquals("Pete", purchaseOrder1.getCustomerFirst());
    }

    @Test
    public void canGetPurchaseOrderCustomerLastName(){
        assertEquals("Doe", purchaseOrder1.getCustomerLast());
    }

    @Test
    public void canSetPurchaseOrderCustomerLastName(){
        newLastName = "Smith";
        purchaseOrder1.setCustomerLast(newLastName);
        assertEquals("Smith", purchaseOrder1.getCustomerLast());
    }

    @Test
    public void canGetPurchaseOrderCompanyName(){
        assertEquals("Fake Company Pty Ltd", purchaseOrder1.getCompany());
    }

    @Test
    public void canSetPurchaseOrderCompanyName(){
        newCompanyName = "Quixotic Company";
        purchaseOrder1.setCompany(newCompanyName);
        assertEquals("Quixotic Company", purchaseOrder1.getCompany());
    }

//    @Test
//    public void canGetPurchaseOrderLineCost(){
//        assertEquals(100, purchaseOrder1.getPurchaseOrderLineCost(purchaseOrderLine1),0.00);
//    }
//
//    @Test
//    public void canSetPurchaseOrderLineCost(){
//        newCost1 = 150;
//        purchaseOrder1.setPurchaseOrderLineCost(purchaseOrderLine1, newCost1);
//        assertEquals(150, purchaseOrder1.getPurchaseOrderLineCost(purchaseOrderLine1),0.00);
//    }
}
