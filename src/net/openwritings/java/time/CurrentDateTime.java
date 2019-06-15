package net.openwritings.java.time;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	// SimpleDateFormat is used because Calendar.toString() outputs more data than needed.
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());

        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));

        LocalDateTime locateDateTime = LocalDateTime.now();
        System.out.println(locateDateTime.toString());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

    }

}
