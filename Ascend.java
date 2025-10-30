// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		//Initializing all the integers used in the code.
		int a, b, c, lim =Integer.parseInt(args[0]), min,max,mid;
		a = (int)(Math.random() * lim);
		b = (int)(Math.random() * lim);
		c = (int)(Math.random() * lim);
		//Finding the minimum and maximum values by comparing all of the integers to each other.
	    min = Math.min(a, b);
		min = Math.min(min, c);
		max = Math.max(a, b);
		max = Math.max(max, c);
		mid = a + b + c - max - min; //Since min and max equal to 2 out of the 3 numbers the leftover must be the middle one.
		System.out.println(a + " " + b + " " + c );
		System.out.println(max + " " + mid + " " + min );

	}
}
