package excel.list;

public class SubString {
    private Table table;
    
    public SubString(Table table) {
        this.table = table;
    }
    public String substring(Position position, int index) {
        String text = table.obtainText(position);
        if(index < text.length()) {
            return text.substring(index);
        } else {
            throw new IndexOutOfBoundsException("index is not valid");
        }

    }
}
