package excel.list;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void testCalculate() {
        Position a1 = new Position('a', 1);
        Position h1 = new Position('h', 1);
        Table table = new Table(); 
        Operator division = new Division(table);
        table.write("12", a1);
        table.write("6", h1);
        double result =  division.Calculate(a1,h1);
        double expected = 2;
        
        assertEquals(expected, result, 0.0);
    }
}
