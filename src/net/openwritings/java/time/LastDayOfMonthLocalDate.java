package net.openwritings.java.time;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastDayOfMonthLocalDate {
	public static void main(String[] args) {
		
		// Set a date, e.g. 2013-01-17.
		LocalDate anyDate = LocalDate.of(2013, 1, 17);
		
		// Get the last day of the month.
		LocalDate lastDayOfMonthDate = anyDate.with(TemporalAdjusters.lastDayOfMonth());
		
		// Display.
		System.out.println(lastDayOfMonthDate);
	}
}
