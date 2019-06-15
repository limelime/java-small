package net.openwritings.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;

public class NewCurrentDateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDateTime locateDateTime = LocalDateTime.now();
        System.out.println(locateDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());

        // Convert current date time to different formats than ISO-8601.
        // **************************************************************
        System.out.println(
        		localDate.format(DateTimeFormatter.ofPattern("E, dd MMMM yyyy")));
        
        System.out.println(
        		locateDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a")));
        
        System.out.println(
        		zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z")));
        
    }

}
