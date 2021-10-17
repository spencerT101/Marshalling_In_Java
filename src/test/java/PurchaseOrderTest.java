import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PurchaseOrderTest {
    private PurchaseOrder purchaseOrder1;
    private ShippingAddress shippingAddress1;
    private String newFirstName;
    private String newLastName;

    @Before
    public void setup(){
        purchaseOrder1 = new PurchaseOrder("John", "Doe", "Fake Company Pty Ltd", 2.00, shippingAddress1 );
        shippingAddress1 = new ShippingAddress("123 Fake St");
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








}
