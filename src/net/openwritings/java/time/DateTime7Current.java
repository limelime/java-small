package net.openwritings.java.time;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateTime7Current {
    public static void main(String[] args) {

    	// Using Date class.
        Date date = new Date();
        System.out.println(date.toString());
        
        // Using Calendar class.
        //		SimpleDateFormat is used because 
        //		Calendar.toString() outputs more data than needed.
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));
    }
}
