// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    //String name1 = args[0], name2 = args[1], name3 = args[2];
		String name1, name2, name3 ;
		//int price = Integer.parseInt(args[3]);
		int price;
	    // Replace this comment with the rest of your code   
		name1="ben";
		name2="gil";
		name3="joe";
		price=93;
		System.out.println("Dear " + name1 + ", " +name2 + " ,and " +name3+": pay "+ price/3 + " Shekels each.");
	}
}
