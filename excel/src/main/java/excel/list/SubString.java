package excel.list;

public class SubString {
    private Table table;
    public SubString(Table table) {
        this.table = table;
    }
    public String subString(String text, int index, Position position) {
        return text.substring(index);
    }
}
