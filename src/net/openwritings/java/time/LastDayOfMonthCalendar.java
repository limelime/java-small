package net.openwritings.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDayOfMonthCalendar {
    public static void main(String[] args) {
    	
    	// Set a date, e.g. 2013-01-17.
    	Calendar anyDate = Calendar.getInstance();
    	anyDate.set(2013, 0, 17); // Note: Month 0 is January.
    	
    	// Get the last day of the month.
        int lastDayOfMonth = anyDate.getActualMaximum(Calendar.DAY_OF_MONTH);
        anyDate.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
        
        // SimpleDateFormat is used because 
        //	Calendar.toString() outputs more data than needed.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(anyDate.getTime()));
    }
}
