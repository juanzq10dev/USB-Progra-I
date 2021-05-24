package miniMarket;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;


public class OrderTest {
    @Test
    public void testAddToListForTwoMilk(){
        Product milk = new Product("Milk", 7, "Dairy");
        Order order = new Order();

        order.addToList(milk, 2);
        ArrayList<Product> expected = new ArrayList<Product>(Arrays.asList(milk, milk));
        ArrayList<Product> result = order.getList();
        assertEquals(expected, result);
    }
    
}
