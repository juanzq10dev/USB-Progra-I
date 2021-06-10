package excel.list;

import java.util.ArrayList;

public class Operator {
    protected Table table;

    public Operator(Table table) {
        this.table = table;
    }

    public ArrayList<Double> transformList(ArrayList<String> cellValues) {
        ArrayList<Double> numbers = new ArrayList<>();

        for (String text : cellValues) {
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
