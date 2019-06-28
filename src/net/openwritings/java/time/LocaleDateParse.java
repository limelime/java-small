package net.openwritings.java.time;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class LocaleDateParse {

	public static void main(String[] args) {

		// Parse
		try {
			Date date = DateFormat.getDateInstance(DateFormat.FULL).parse("Friday, June 28, 2019");
			System.out.println("Parsed FULL locale date format : " + date);
			
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
}
