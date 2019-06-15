package net.openwritings.java.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AddSubDateTime {

	public static void main(String[] args) {

		// Get today.
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today.toString());

        // Additions
        System.out.println(" 2 seconds later = " + today.plusSeconds(2).toString());
        System.out.println(" 3 mintues later = " + today.plusMinutes(3).toString());
        System.out.println(" 5 hours   later = " + today.plusHours(5).toString());
        System.out.println(" 7 days    later = " + today.plusDays(7).toString());
        System.out.println(" 5 weeks   later = " + today.plusWeeks(5).toString());
        System.out.println(" 9 months  later = " + today.plusMonths(9).toString());
        System.out.println("10 years   later = " + today.plusYears(10).toString());

        // Subtractions.
        System.out.println(" 2 seconds ago = " + today.minusSeconds(2).toString());
        System.out.println(" 3 mintues ago = " + today.minusMinutes(3).toString());
        System.out.println(" 5 hours   ago = " + today.minusHours(5).toString());
        System.out.println(" 7 days    ago = " + today.minusDays(7).toString());
        System.out.println(" 5 weeks   ago = " + today.minusWeeks(5).toString());
        System.out.println(" 9 months  ago = " + today.minusMonths(9).toString());
        System.out.println("10 years   ago = " + today.minusYears(10).toString());
        
        // Get the different between 2 dates.
        LocalDateTime tomorrow = today.plusDays(1);
        long minutes = ChronoUnit.MINUTES.between(today, tomorrow);
        System.out.println("Number of minutes between today & tomorrow is: " + minutes);
	}

}
