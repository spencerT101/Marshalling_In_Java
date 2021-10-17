import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShippingAddressTest {

    private ShippingAddress shippingAddress0;
    private String newAddressLine1;
    private String newAddressLine2;

    @Before
    public void setup(){
        shippingAddress0 = new ShippingAddress("123 Fake St", "Fake Building");
    }

    @Test
    public void canGetShippingAddressLine1(){
        assertEquals("123 Fake St", shippingAddress0.getShippingAddressLine1());
    }

    @Test
    public void canSetShippingAddress0(){
        newAddressLine1 = "321 Fake St";
        shippingAddress0.setShippingAddressLine1(newAddressLine1);
        assertEquals("321 Fake St", shippingAddress0.getShippingAddressLine1());
    }

    @Test
    public void canGetShippingAddressLine2(){
        assertEquals("Fake Building", shippingAddress0.getShippingAddressLine2());
    }

    @Test
    public void canSetShippingAddressLine2(){
        newAddressLine2 = ""
        assertEquals();
    }



}
