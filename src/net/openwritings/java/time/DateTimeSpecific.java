package net.openwritings.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class DateTimeSpecific {

	public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, 10, 27);
        System.out.println(localDate.toString());

        LocalDateTime localDateTime = LocalDateTime.of(2019, 10, 27, 7, 59, 59);
        System.out.println(localDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("UTC-5"));
        System.out.println(zonedDateTime.toString());
	}
}
