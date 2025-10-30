// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0], name2 = args[1], name3 = args[2];
		//Converting price to a number so we can use it for calculations.
		double price = Double.parseDouble(args[3]);
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +": pay " + Math.ceil(price/3) + " Shekels each.");
	}
}
