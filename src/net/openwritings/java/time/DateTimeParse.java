package net.openwritings.java.time;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateTimeParse {

	public static void main(String[] args) {
		
		String str = "2016/03/27, 11:37:59";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd, HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		
        System.out.println(dateTime.toString());
	}
}
