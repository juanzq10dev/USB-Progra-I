package excel.list;

public class Division extends Operator{

	public Division(Table table) {
		super(table);
		//TODO Auto-generated constructor stub
	} 

	public double Calculate(Position initialPosition, Position finalPosition) {
		double division = 0;
		double result = 0;
		transformList(initialPosition, finalPosition);
		double divisor = numbers.get(0);
		double dividend = numbers.get(numbers.size() - 1);
		if(dividend != 0){
		    division = divisor / dividend;
		} else { 
			throw new IllegalArgumentException("dividend cannot be 0");
		}
		result = division;  
		double roundedResult = (double) (Math.round(result * 100)) / 100;
		return roundedResult;
	} 
}
