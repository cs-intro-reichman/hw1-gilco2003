// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//Initializing values according to the given parameters.
		int currentValue = Integer.parseInt(args[0]), numberOfYears = Integer.parseInt(args[2]);
		double interestRate = Double.parseDouble(args[1]), futureValue;
		//I divided the interest rate by a hundred because it represents a percantage.
		futureValue = currentValue * Math.pow((1.0 + interestRate/100), numberOfYears);
		System.out.println("After " + numberOfYears + " years, " + currentValue + "$ saved at " + interestRate + "% will yield " + (int)futureValue + "$");

	}
}