package net.openwritings.java.time;

import java.util.Date;
import java.text.DateFormat;

public class LocaleDate {

	public static void main(String[] args) {

	    // Get today's date.
	    Date today = new Date();
	    
	    String d = DateFormat.getDateInstance(DateFormat.SHORT).format(today);
	    System.out.println("SHORT  : " + d);
	    
	    d = DateFormat.getDateInstance(DateFormat.MEDIUM).format(today);
	    System.out.println("MEDIUM : " + d);
	    
	    d = DateFormat.getDateInstance(DateFormat.LONG).format(today);
	    System.out.println("LONG   : " + d);
	    
	    d = DateFormat.getDateInstance(DateFormat.FULL).format(today);
	    System.out.println("FULL   : " + d);
	    
	    d = DateFormat.getDateInstance(DateFormat.DEFAULT).format(today);
	    System.out.println("DEFAULT: " + d);

	}

}
