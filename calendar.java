package demo.utility;

import java.util.Calendar;

public class calendar {
	
	public static void invoke()
	{
	
	Calendar cal = Calendar.getInstance();
	System.out.println("Current date :"+cal.getTime());
	cal.add(Calendar.DATE, -15);
	System.out.println("15 days ago :"+cal.getTime());
	cal.add(Calendar.MONTH, 4);
	System.out.println("4 month later :"+cal.getTime());
	cal.add(Calendar.YEAR, 3);
	System.out.println("3 years later :"+cal.getTime());
	
	System.out.println("At present Calendar's Year: " + cal.get(Calendar.YEAR));  
	System.out.println("At present Calendar's Day: " + cal.get(Calendar.DATE));  
	
	
	}
	
	public static void main(String[] args) {
		
		invoke();
	}
	

}
