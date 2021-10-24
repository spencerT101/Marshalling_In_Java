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
    private PurchaseOrderLine purchaseOrderLine2;

    @Before
    public void setUp(){
        purchaseOrderDetail = new PurchaseOrderDetail(purchaseOrderInfo);
        purchaseOrderInfo = new ArrayList<>();
        purchaseOrderLine1 = new PurchaseOrderLine("123456", "Fake Product", "1", 100, "GBP");
        purchaseOrderLine2 = new PurchaseOrderLine("78910","Bootleg Product", "2", 150, "EUR");
    }

    @Test
    public void canGetPurchaseOrderInfoSize(){
        assertEquals(0, purchaseOrderDetail.getPurchaseOrderLineSize());
    }

    @Test
    public void canAddPurchaseOrderLineToPurchaseOrderArrayList(){
        purchaseOrderDetail.addPurchaseLine(purchaseOrderLine1);
        assertEquals(1, purchaseOrderDetail.getPurchaseOrderLineSize());
    }

    @Test
    public void canRemovePurchaseOrderLineFromPurchaseOrderArrayList(){
        purchaseOrderDetail.addPurchaseLine(purchaseOrderLine1);
        purchaseOrderDetail.addPurchaseLine(purchaseOrderLine2);
        purchaseOrderDetail.removePurchaseLine(purchaseOrderLine1);
        assertEquals(1, purchaseOrderDetail.getPurchaseOrderLineSize());
    }
}
