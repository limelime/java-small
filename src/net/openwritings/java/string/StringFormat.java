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

	}

}
