package excel.list;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
    @Test
    void testCalculate() {
        Position a1 = new Position('a', 1);
        Position a2 = new Position('a', 2);
        Position b1 = new Position('b', 1);
        Position b2 = new Position('b', 2);
        Table table = new Table(); 
        Operator average = new Average(table);
        table.write("abc", a2);
        table.write("13", b1);
        table.write("105", a1);
        table.write("55", b2);
        double result =  average.Calculate(a1,b2);
        double expected = 57.67;
        
        assertEquals(expected, result, 0.0);
    }
}
