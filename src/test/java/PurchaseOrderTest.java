import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PurchaseOrderTest {
    private PurchaseOrder purchaseOrder1;
    private ShippingAddress shippingAddress1;
    private String newName;

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
       newName = "Pete";
       purchaseOrder1.setCustomerFirst(newName);
       assertEquals("Pete", purchaseOrder1.getCustomerFirst());
    }

    @Test
    public void canGetPurchaseOrderCustomerLastName(){
        assertEquals("Doe", purchaseOrder1.getCustomerLast());
    }







}
