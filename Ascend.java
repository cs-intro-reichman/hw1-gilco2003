// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int a, b, c, lim =Integer.parseInt(args[0]), min = 0,max = lim,mid;
		a = (int)(Math.random()*lim);
		b = (int)(Math.random()*lim);
		c = (int)(Math.random()*lim);
	    min=Math.min(a, b);
		min=Math.min(min, c);
		max=Math.max(a, b);
		max=Math.max(max, c);
		mid = a + b + c - max -min;
		System.out.println(a + " " + b + " " + c );
		System.out.println(max + " " + mid + " " + min );

	}
}
