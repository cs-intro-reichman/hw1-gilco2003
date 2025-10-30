// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		/*Module 10 gives you the units for every number you use it on.
	     As for the hunderds you simply divide by a hundred.
		For the tens if you use module 100 you will get 10 * number of tens + 1 * number of units, 
		all that's left is to reverse the equation so you get the numer of tens*/
		int digitsNum = num % 10;
		int tensNum = (num % 100 - digitsNum) / 10;
		int hundredsNum = num / 100;
		System.out.println(hundredsNum+ " hundreds, " + tensNum + " tens, and " + digitsNum +  " ones.");
	}
}
