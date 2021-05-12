package numPrimos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class NumerosPrimosTest {

    @Test 
    public void testForOne(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(1); 
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, result);
    }
    
}
