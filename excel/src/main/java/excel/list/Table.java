package excel.list;

public class Table {
    private String[][] tabular;
    private Position position;

    public Table() {
        String[][] tabular = new String[26][50];
        this.tabular = tabular;
    }

    public boolean write(String text, Position position) {
        boolean readText = text != null;
        boolean readPosition = position != null;
        boolean write = readText && readPosition;

        try {
            for (String[] positions : tabular);
        } catch (Exception e) {
            return false;
        }
        return write;
    }
}