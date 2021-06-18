package excel.list;

public class SubString {
    private Table table;
    
    public SubString(Table table) {
        this.table = table;
    }
    public String substring(Position position, int index) {
        if(index < table.text.length()) {
            return table.text.substring(index);
        } else {
            throw new IllegalArgumentException("Is out of the index");
        }

    }
}
