package net.openwritings.java.time;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());
        
        // SimpleDateFormat is used because Calendar.toString() outputs more data than needed.
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDateTime locateDateTime = LocalDateTime.now();
        System.out.println(locateDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());
        
        // Convert to different formats than using toString().
        // ***************************************************
        System.out.println(sdf.format(date.getTime()));
        
        System.out.println(
        		localDate.format(DateTimeFormatter.ofPattern("E, dd MMMM yyyy")));
        
        System.out.println(
        		locateDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a")));
        
        System.out.println(
        		zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z")));
        
        
    }

}
