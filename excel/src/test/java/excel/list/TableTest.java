package excel.list;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TableTest {
    @Test
    public void writeShouldLetWriteATextWithAPosition() {
        Table table = new Table();
        String text = "50";
        Position position  = new Position(3,10);
        boolean result = table.write(text, position);
        assertTrue(result);
    }

    @Test
    public void writeShouldNotLetWriteOutsideOfTheArray() {
        Table table = new Table();
        String text = null;
        Position position  = new Position(100,100);
        boolean result = table.write(text, position);
        assertFalse(result);
    }
}
