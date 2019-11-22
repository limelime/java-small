package net.openwritings.java.string;

public class StringFormat {

	public static void main(String[] args) {
		// Using string concatenation.
		int age=1, qty=2, count=3;
		String concat = "("+age+", "+qty+", "+count+")";
		System.out.println(concat);
		
		// Using String.format().
		String sf = String.format("(%s, %s, %s)", age, qty, count);
		System.out.println(sf);
		
		// -----------------
		// ## Format string.
		
		// Pre-allocate 10 chars space for each variable.
		sf = String.format("(%10s, %10s, %10s)", age, qty, count);
		System.out.println(sf);

		// Right align value.
		sf = String.format("(%-10s, %-10s, %-10s)", age, qty, count);
		System.out.println(sf);

		
		// -----------------
		// ## Format number.
		
		// Show only 2 decimal points.
		double avg = 3695.32756;
		sf = String.format("%.2f", avg);
		System.out.println(sf);

		// Add thousand separator using comma(,).
		sf = String.format("%,.2f", avg);
		System.out.println(sf);
	
		// Pad zeros so the length is 9 digits long.
		sf = String.format("%09d", count);
		System.out.println(sf);				

	}

}
