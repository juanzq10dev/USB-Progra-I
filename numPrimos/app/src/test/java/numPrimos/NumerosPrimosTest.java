package numPrimos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class NumerosPrimosTest {

    @Test 
    public void numPrimosTestForOne(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(1); 
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, result);
    }

    @Test 
    public void numPrimosTestForTwo(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(2); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertEquals(expected, result);
    }

    @Test 
    public void numPrimosTestForThree(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(3); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);

        assertEquals(expected, result);
    }

    @Test 
    public void numPrimosTestForFour(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(4); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertEquals(expected, result);
    }

    @Test 
    public void numPrimosTestForFive(){
        NumerosPrimos numPrimos = new NumerosPrimos();
        ArrayList<Integer> result = numPrimos.generate(5); 
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);

        assertEquals(expected, result);
    }
    
}
