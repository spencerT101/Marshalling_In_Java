import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PurchaseOrderLineTest {

    private PurchaseOrderLine purchaseOrderLine0;

    @Before
    public void setUp(){
        purchaseOrderLine0 = new PurchaseOrderLine("123456");
    }

    @Test
    public void canGetItemID(){
        assertEquals("123456", purchaseOrderLine0.getItemID());
    }
}
