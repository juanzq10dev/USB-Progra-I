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
        int value = x - 65;
        return value;
    }

    public int obtainRowColumn() {
        return y - 1;
    }
}

