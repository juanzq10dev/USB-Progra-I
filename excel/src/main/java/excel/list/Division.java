package excel.list;

public class Division extends Operator{

	public Division(Table table) {
		super(table);
		//TODO Auto-generated constructor stub
	}

	public double Calculate(Position initialPosition, Position finalPosition) {
		transformList(initialPosition, finalPosition);
		result = numbers.get(0) / numbers.get(1);
		return result;
	}
}
