package excel.list;

import java.util.ArrayList;

public class Operator {
    protected Table table;
    protected ArrayList<Double> numbers;
    protected double result;

    public Operator(Table table) {
        this.table = table;
        this.numbers = new ArrayList<Double>();
        this.result = 0;
    }

    protected ArrayList<Double> transformList(Position initialPosition, Position finalPosition) {
        ArrayList<String> cellValues = table.obtainRangeList(initialPosition, finalPosition);

        for (String text : cellValues) {
            double value = 0;
            try {
                value = Double.parseDouble(text);
                numbers.add(value);
            } catch (NumberFormatException e) {
                
            }
        }
        return numbers;
    }

    public double Calculate(Position initialPosition, Position finalPosition) {
        transformList(initialPosition, finalPosition);
        return result;
    }
}
