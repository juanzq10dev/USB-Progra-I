package miniMarket;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testGetNameForMilk() {
        Product product = new Product("Milk", 12, "Dairy");
        String result = product.getName();
        assertEquals("Milk", result);
    }

    @Test
    public void testGetPriceForMilk() {
        Product product = new Product("Milk", 12, "Dairy");
        double result = product.getPrice();
        double expected = 12;
        assertEquals(expected, result, 12);
    }

    @Test
    public void testGetTypeForMilk() {
        Product product = new Product("Milk", 12, "Dairy");
        String result = product.getType();
        assertEquals("Dairy", result);
    }
}
