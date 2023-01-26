package com.lnw.postJava8;

public class DaysinMonth {

	private static enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, 
		JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
		NOVEMBER, DECEMBER
	}
	
	private static void getNumDays(Months month, int year) {
		
		int num = switch (month) {
		  	case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
			case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
			case FEBRUARY -> {
				if (isLeapYear(year)) 
                    yield 29;
                else yield 28;
			}			
		 };
		 System.out.println(num + " Days in the Month");
	}
	
	private static boolean isLeapYear(int year) {
		if (( year % 400 == 0)|| (( year % 4 == 0 ) && ( year % 100 != 0))) {
			return true;
		}else {
			return false;
		}		
		
	}
	
	public static void main(String[] args) {
		getNumDays(Months.FEBRUARY , 2025);
	}

}
