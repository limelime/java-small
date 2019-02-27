package net.openwritings.java.lang;

public class StringFormat {

	public static void main(String[] args) {
		
		String name="Joe";
		int age = 23;
		float weight = 179.24f;
		double salary = 76900.33;
		
		String s="row results=> name="+name+", age="+age+", weight="+weight+", salary="+salary;
		System.out.println(s);
		
		s=String.format("row results=> name=%s, age=%d, weight=%s, salary=%s", name, age, weight, salary);
		System.out.println(s);
		
	}

}
