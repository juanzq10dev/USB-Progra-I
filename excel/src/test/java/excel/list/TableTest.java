package excel.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TableTest {
    @Test
    public void writeShouldLetWriteATextWithAPosition() {
        Table table = new Table();
        String text = "50";
        Position position  = new Position('X',10);
        boolean result = table.write(text, position);
        assertTrue(result);
    }

    @Test
    public void writeShouldNotLetWriteOutsideOfTheArray() {
        Table table = new Table();
        String text = null;
        Position position  = new Position('X',100);
        boolean result = table.write(text, position);
        assertFalse(result);
    }

    @Test
    public void transformPositionToArrayShouldGiveAArrayOfPosition() {
        Position B2 = new Position('B', 2);
        Table table = new Table();
        assertTrue(table.write("hola", B2));
    }

    @Test
    public void testObtainRangeListShouldReturnList () {
        Position A1 = new Position ('A', 1);
        Position A2 = new Position('A', 2);
        Position B2 = new Position ('B', 2);

        Table table = new Table();
        table.write("hola Ariel", A2); 
        table.write("hola Diego", A1);
        table.write("hola Valeria", B2);

        ArrayList<String> result = table.obtainRangeList(A1, B2);
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("hola Diego", "hola Ariel", "hola Valeria")); 

        assertEquals(expected, result);
    }
}
