import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PurchaseOrderLineTest {

    private PurchaseOrderLine purchaseOrderLine0;
    private String newItemID;
    private String newItemName;
    private String newQty;
    private double newCost;
    private String newCurrency;

    @Before
    public void setUp(){
        purchaseOrderLine0 = new PurchaseOrderLine("123456", "Fake Product", "1", 100, "GBP");
    }

    @Test
    public void canGetItemID(){
        assertEquals("123456", purchaseOrderLine0.getItemID());
    }

    @Test
    public void canSetItemID(){
        newItemID = "78910";
        purchaseOrderLine0.setItemID(newItemID);
        assertEquals("78910", purchaseOrderLine0.getItemID());
    }
    @Test
    public void canGetItemName(){
        assertEquals("Fake Product", purchaseOrderLine0.getItemName());
    }

    @Test
    public void canSetItemName(){
        newItemName = "Counterfeit Product";
        purchaseOrderLine0.setItemName(newItemName);
        assertEquals("Counterfeit Product", purchaseOrderLine0.getItemName());
    }

    @Test
    public void canGetQty(){
        assertEquals("1", purchaseOrderLine0.getQty());
    }

    @Test
    public void canSetQty(){
        newQty = "2";
        purchaseOrderLine0.setQty(newQty);
        assertEquals("2", purchaseOrderLine0.getQty());
    };

    @Test
    public void canGetCost(){
        assertEquals(100, purchaseOrderLine0.getCost(), 0.00);
    }

    @Test
    public void canSetCost(){
        newCost = 150;
        purchaseOrderLine0.setCost(newCost);
        assertEquals(150, purchaseOrderLine0.getCost(),0.00);
    }

    @Test
    public void canGetCurrency(){
        assertEquals("GBP", purchaseOrderLine0.getCurrency());
    }

    @Test
    public void canSetCurrency(){
        newCurrency = "EUR";
        purchaseOrderLine0.setCurrency(newCurrency);
        assertEquals("EUR", purchaseOrderLine0.getCurrency());
    }

}
