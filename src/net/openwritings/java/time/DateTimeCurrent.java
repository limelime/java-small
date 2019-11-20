package net.openwritings.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCurrent {

	public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());

        // Convert current date time to different formats than ISO-8601.
        // **************************************************************
        System.out.println(
        		localDate.format(DateTimeFormatter.ofPattern("E, dd MMMM yyyy")));
        
        System.out.println(
        		localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a")));
        
        System.out.println(
        		zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z")));
	}
}
