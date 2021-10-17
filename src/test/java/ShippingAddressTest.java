import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShippingAddressTest {

    private ShippingAddress shippingAddress0;
    private String newAddressLine1;

    @Before
    public void setup(){
        shippingAddress0 = new ShippingAddress("123 Fake St", "Fake Building");
    }

    @Test
    public void canGetShippingAddressLine1(){
        assertEquals("123 Fake St", shippingAddress0.getShippingAddressLine1());
    }

    @Test
    public void setShippingAddress0(){
        newAddressLine1 = "321 Fake St";
        shippingAddress0.setShippingAddressLine1(newAddressLine1);
        assertEquals("321 Fake St", shippingAddress0.getShippingAddressLine1());
    }

    @Test
    

}
