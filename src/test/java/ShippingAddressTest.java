import com.example.iwservice.shippingaddress.ShippingAddress;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShippingAddressTest {

    private ShippingAddress shippingAddress0;
    private String newAddressLine1;
    private String newAddressLine2;
    private String newCity;
    private String newPostCode;
    private String newCountry;

    @Before
    public void setup(){
        shippingAddress0 = new ShippingAddress("123 Fake St", "Fake Building", "London", "UN0 0NU","UK");
    }

    @Test
    public void canGetShippingAddressLine1(){
        assertEquals("123 Fake St", shippingAddress0.getShippingAddressLine1());
    }

    @Test
    public void canSetShippingAddress1(){
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
        newAddressLine2 = "Knock-off Building";
        shippingAddress0.setShippingAddressLine2(newAddressLine2);
        assertEquals("Knock-off Building", shippingAddress0.getShippingAddressLine2());
    }

    @Test
    public void canGetCity(){
        assertEquals("London", shippingAddress0.getCity());
    }

    @Test
    public void canSetCity(){
        newCity = "Manchester";
        shippingAddress0.setCity(newCity);
        assertEquals("Manchester", shippingAddress0.getCity());

    }

    @Test
    public void canGetPostCode(){
        assertEquals("UN0 0NU", shippingAddress0.getPostCode());
    }

    @Test
    public void canSetPostCode(){
        newPostCode = "NO8 4RL";
        shippingAddress0.setPostCode(newPostCode);
        assertEquals("NO8 4RL", shippingAddress0.getPostCode());
    }

    @Test
    public void canGetCountry(){
        assertEquals("UK", shippingAddress0.getCountry());
    }
    
    @Test
    public void canSetCountry(){
        newCountry = "USA";
        shippingAddress0.setCountry(newCountry);
        assertEquals("USA", shippingAddress0.getCountry());
    }

}
