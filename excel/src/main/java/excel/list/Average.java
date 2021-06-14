package excel.list;

public class Average extends Operator {

	public Average(Table table) {
		super(table);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Calculate(Position initialPosition, Position finalPosition) {
		double division = 0;

		transformList(initialPosition, finalPosition);
		for (double number : numbers) {
			result = result + number;
		}

		division = result / numbers.size();
		double roundedResult = (double) (Math.round(division * 100)) / 100;
		return roundedResult;
	}
}