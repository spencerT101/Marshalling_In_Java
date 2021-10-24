import com.example.iwservice.purchaseorder.PurchaseOrder;
import com.example.iwservice.purchaseorderdetail.PurchaseOrderDetail;
import com.example.iwservice.purchaseorderline.PurchaseOrderLine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class PurchaseOrderDetailTest {

    private PurchaseOrderDetail purchaseOrderDetail;
    private ArrayList<PurchaseOrderLine> purchaseOrderInfo;
    private PurchaseOrderLine purchaseOrderLine1;

    @Before
    public void setUp(){
        purchaseOrderDetail = new PurchaseOrderDetail(purchaseOrderInfo);
        purchaseOrderInfo = new ArrayList<>();
        purchaseOrderLine1 = new PurchaseOrderLine("123456", "Fake Product", "1", 100, "GBP");
    }

    @Test
    public void canGetPurchaseOrderInfoSize(){
        assertEquals(0, purchaseOrderDetail.getPurchaseOrderLineSize());
    }




}
