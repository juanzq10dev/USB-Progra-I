package excel.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubStringTest {
    @Test
    public void subStringShouldGiveAStringFromAIndex() {
        Table table = new Table();
        SubString subString = new SubString(table);
        String text = "Hello World";
        int index = 4;
        Position A5 = new Position('A', 5);
        table.write(text, A5);
        String result = subString.subString(text, 4, A5);
        String expected = "o World";
        assertEquals(expected, result);
    }
}
