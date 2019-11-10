package net.openwritings.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDayOfMonthCalendar {
	
    public static void main(String[] args) {
    	
    	// Set a date, e.g. 2011-01-17.
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(2011, 0, 17); // Month 0 is January.
    	
    	// Get the last day of the month:
    	//	-Add 1 month to the date. e.g. 2011-02-17.
    	//	-Set date to be the 1st day of the month. e.g. 2011-02-01
    	//	-Subtract a day. e.g. 2011-01-31
        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        calendar.add(Calendar.DATE, -1);  
 	
        // SimpleDateFormat is used because Calendar.toString() outputs more data than needed.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));
    	
    }
}
