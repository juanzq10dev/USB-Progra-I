package excel.list;

import java.util.ArrayList;

import javax.management.ValueExp;

public class Table {
    private String[][] tabular;

    public Table() {
        String[][] tabular = new String[26][50];
        this.tabular = tabular;
    }

    public boolean write(String text, Position position) {
        boolean readText = text != null;
        boolean readPosition = position != null;
        boolean write = readText && readPosition;

        int row = position.obtainTransformedPositionX();
        int column = position.obtainTransformedPositionY();
        try {
            tabular[row][column] = text;
        } catch (IndexOutOfBoundsException e) {
            
        }
        return write;
    }

    public ArrayList<String> obtainRangeList(Position initialPosition, Position finalPosition) {
        ArrayList<String> textList = new ArrayList<String>();

        int initialRow = initialPosition.obtainTransformedPositionX();
        int finalRow = finalPosition.obtainTransformedPositionX();

        int initialColumn = initialPosition.obtainTransformedPositionY();
        int finalColumn = finalPosition.obtainTransformedPositionY();

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