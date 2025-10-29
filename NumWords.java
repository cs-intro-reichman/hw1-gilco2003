// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int digitsNum = num % 10, tensNum = (num % 100-digitsNum)/10, hundredsNum = num/100;
		System.out.println(hundredsNum+ " hundreds, " + tensNum + " tens, and " + digitsNum +  " ones.");
	}
}
