package excel.list;

public class Position {
    private char column;
    private int row;

    public Position(char column, int row) {
        if (Character.isLetter(column)) {
            this.column = Character.toUpperCase(column);
        } else {
            throw new IllegalArgumentException("Character column Shold Be a Letter");
        }
        this.row = row;
    }

    public int obtainColumnValue() {
        return column - 65;
    }

    public int obtainRowValue() {
        return row - 1;
    }
}

