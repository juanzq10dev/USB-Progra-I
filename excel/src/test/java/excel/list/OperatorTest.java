package excel.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class OperatorTest {

    @Test
    void testTransformList() {
        Table table = new Table(); 
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("fldsmdfr", "13", "15", "123patito"));
        Operator operator = new Operator(table);
        ArrayList<Double> result = operator.transformList(list); 
        ArrayList<Double> expected = new ArrayList<Double>(Arrays.asList(13.0, 15.0));
        assertEquals(expected, result);
    }
    
}
