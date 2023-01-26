package com.lnw.postJava8;

public class DaysinMonth5 {

	private static enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, 
		JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
		NOVEMBER, DECEMBER
	}
	
	private static void getNumDays(Months month) {
		
		switch (month)
		{
		  	case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
		  	    int num = 31;			
		  	    System.out.println(" 31 Days in this Month");
		  	}
			case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
				int num = 30;
				System.out.println("30 Days in this Month"); 
			}			 			
			case FEBRUARY -> 
				System.out.println("Either 28 or 29 Days in this Month"); 			
		  }
	}
	
	public static void main(String[] args) {
		getNumDays(Months.OCTOBER);
	}

}
