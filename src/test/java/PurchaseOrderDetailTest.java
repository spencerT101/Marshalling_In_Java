import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import org.junit.Before;

import java.util.ArrayList;

public class PurchaseOrderDetailTest {

    private ArrayList<PurchaseOrderLine> purchaseOrderInfo;
    private PurchaseOrderLine purchaseOrderLine1;

    @Before
    public void setUp(){
        purchaseOrderInfo = new ArrayList<>();
        purchaseOrderLine1 = new PurchaseOrderLine("123456", "Fake Product", "1", 100, "GBP");
    }




}
