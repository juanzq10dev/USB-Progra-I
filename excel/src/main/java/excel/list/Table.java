package excel.list;

import java.util.ArrayList;

public class Table {
    private String[][] tabular;

    public Table() {
        this.tabular = new String[50][26];
    }

    public boolean write(String text, Position position) {
        boolean readText = text != null;

        int row = position.obtainRowValue();
        int column = position.obtainColumnValue();
        boolean readPosition = row < 50 && column < 26;
        boolean write = readText && readPosition;
        if(write == true) {
            tabular[row][column] = text;
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
                String value = tabular[column][row];
                if (value != null) {
                    textList.add(value);
                }
            }
        }
        return textList;
    }
}