import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PurchaseOrderTest {
    private PurchaseOrder purchaseOrder1;
    private ShippingAddress shippingAddress1;
    private PurchaseOrderDetail purchaseOrderDetail1;
    private PurchaseOrderLine purchaseOrderLine1;
    private String newFirstName;
    private String newLastName;
    private String newCompanyName;
    private double newOrderAmount;
    private String newAddressLine1;


    @Before
    public void setup(){
        purchaseOrder1 = new PurchaseOrder("John", "Doe", "Fake Company Pty Ltd", 2.00, shippingAddress1, purchaseOrderDetail1);
        shippingAddress1 = new ShippingAddress("123 Fake St", "Fake Building", "London", "UN0 0NO", "UK");
        purchaseOrderDetail1 = new PurchaseOrderDetail(purchaseOrderLine1);
        purchaseOrderLine1 = new PurchaseOrderLine();
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

    @Test
    public void canGetPurchaseOrderOrderAmount(){
        assertEquals(2.00, purchaseOrder1.getOrderAmount(), 0.00);
    }

    @Test
    public void canSetPurchaseOrderOrderAmount(){
        newOrderAmount = 10.00;
        purchaseOrder1.setOrderAmount(newOrderAmount);
        assertEquals(10.00,purchaseOrder1.getOrderAmount(),0.00);
    }

    @Test
    public void canGetPurchaseOrderShippingAddressLine1(){
        assertEquals("123 Fake St", purchaseOrder1.getPurchaseOrderShippingAddressLine1(shippingAddress1));
    }

    @Test
    public void canSetPurchaseOrderShippingAddressLine1(){
        newAddressLine1 = "321 Fake St";
        assertEquals("321 Fake St", purchaseOrder1.setPurchaseOrderShippingAddressLine1(shippingAddress1, newAddressLine1));
    }
}
