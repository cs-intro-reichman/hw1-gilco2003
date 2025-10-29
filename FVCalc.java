// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]), numberOfYears = Integer.parseInt(args[2]);
		double interestRate = Double.parseDouble(args[1]), futureValue;
		futureValue = currentValue * Math.pow((1.0 + interestRate), numberOfYears)/100;
		System.out.println(futureValue);
		System.out.println("After " + numberOfYears + " years, " + currentValue + "$ saved at " + interestRate + "% will yield " + (int)futureValue+"$");

	}
}