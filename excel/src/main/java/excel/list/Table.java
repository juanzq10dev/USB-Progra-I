package excel.list;

import java.util.ArrayList;

public class Table {
    private String[][] tabular;

    public Table() {
        this.tabular = new String[26][50];
    }

    public boolean write(String text, Position position) {
        boolean readText = text != null;
        boolean readPosition = position != null;
        boolean write = readText && readPosition;

        int row = position.obtainColumnValue();
        int column = position.obtainRowValue();
        try {
            tabular[row][column] = text;
        } catch (IndexOutOfBoundsException e) {
            
        }
        return write;
    }

    public ArrayList<String> obtainRangeList(Position initialPosition, Position finalPosition) {
        ArrayList<String> textList = new ArrayList<String>();

        int initialColumn = initialPosition.obtainColumnValue();
        int finalColumn = finalPosition.obtainColumnValue();

        int initialRow = initialPosition.obtainRowValue();
        int finalRow = finalPosition.obtainRowValue();

        for (int row = initialRow; row <= finalRow; row++) {
            for (int column = initialColumn; column <= finalColumn; column++) {
                String value = tabular[row][column];
                if (value != null) {
                    textList.add(value);
                }
            }
        }
        return textList;
    }
}