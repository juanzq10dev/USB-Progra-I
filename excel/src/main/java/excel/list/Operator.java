package excel.list;

import java.util.ArrayList;

public class Operator {
    protected Table table;
    protected ArrayList<String> characters;

    public Operator(Table table) {
        this.table = table;
        this.characters = new ArrayList<String>();
    }

    public ArrayList<Double> transformList(ArrayList<String> textList) {
        ArrayList<Double> numbers = new ArrayList<>();

        for (String text : textList) {
            double value = 0;
            try {
                value = Double.parseDouble(text);
            } catch (NumberFormatException e) {

            }
            if (value != 0) {
                numbers.add(value);
            }
        }
        return numbers;
    }
}
