package excel.list;

public class Position {
    private char x;
    private int y;

    public Position(char x, int y) {
        if (Character.isLetter(x)) {
            this.x = Character.toUpperCase(x);
        } else {
            throw new IllegalArgumentException("Character X Shold Be a Letter");
        }
        this.y = y;
    }

    public int obtainTransformedPositionX() {
        return transformWordToNumber() - 1;
    }

    public int obtainTransformedPositionY() {
        return y - 1;
    }

    private int transformWordToNumber() {
        int value = x - 64;
        return value;
    }
}
