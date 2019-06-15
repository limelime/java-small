package net.openwritings.java.lang;

public class SwitchExpressions {

	public static void main(String[] args) {
		final int MONDAY=1; final int TUESDAY=2; final int WEDNESDAY=3; final int THURSDAY=4; final int FRIDAY=5;
		final int SATURDAY=6; final int SUNDAY=7;
		int day=1;
		switch (day) {
		    case MONDAY:
		    case TUESDAY:
		    case WEDNESDAY:
		    case THURSDAY:
		    case FRIDAY:
		        System.out.println("Weekday");
		        break;
		    case SATURDAY:
		    case SUNDAY:
		        System.out.println("Weekend");
		        break;
		}
		
	}

}
