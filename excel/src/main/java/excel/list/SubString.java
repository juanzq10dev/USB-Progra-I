package excel.list;

public class SubString {
    private Table table;
    public SubString(Table table) {
        this.table = table;
    }
    public String substring(String text, int index, Position position) {
        boolean write = table.write(text, position);
        if(write && index < text.length()) {
            return text.substring(index);
        } else {
            throw new IllegalArgumentException("Is out of the index");
        }

    }
}
