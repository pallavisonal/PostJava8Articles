package com.lnw.postJava8;

public class DaysinMonth2 {

	private static enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, 
		JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
		NOVEMBER, DECEMBER
	}
	
	private static void getNumDays(Months month) {
		switch (month)
		{
		  	case JANUARY:
		  	case MARCH:
			case MAY: 	
			case JULY:
			case AUGUST:
			case OCTOBER:
			case DECEMBER:			  	
				System.out.println(" 31 Days in this Month");
			  	break;			
			case APRIL:	
			case JUNE:
			case SEPTEMBER:
			case NOVEMBER:			    	
				System.out.println("30 Days in this Month");  
				break;			
			case FEBRUARY:
				System.out.println("Either 28 or 29 Days in this Month"); 
				break;			
		  }
	}
	
	public static void main(String[] args) {
		getNumDays(Months.APRIL);
	}

}
