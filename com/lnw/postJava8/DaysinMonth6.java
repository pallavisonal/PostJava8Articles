package com.lnw.postJava8;

public class DaysinMonth6 {

	private static enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, 
		JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
		NOVEMBER, DECEMBER
	}
	
	private static void getNumDays(Months month) {
		
		int num = switch (month) {
		  	case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
			case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
			case FEBRUARY -> 28;			
		 };
		 System.out.println(num + " Days in the Month");
	}
	
	public static void main(String[] args) {
		getNumDays(Months.OCTOBER);
	}

}
