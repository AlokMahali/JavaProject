package collections;

import java.util.Calendar;

public class Ch23_CalendarDemo {
	
	public static void main(String args[]){
		Calendar cl = Calendar.getInstance();
		System.out.println("Current Date:  ");
		int dd= cl.get(Calendar.DATE);
		int mm=cl.get(Calendar.MONTH);
		++mm;
		int yy=cl.get(Calendar.YEAR);
		System.out.println(dd+"/"+mm+"/"+yy);
		
		System.out.println("Current time");
		int sec=cl.get(Calendar.SECOND);
		int min=cl.get(Calendar.MINUTE);
		int hr=cl.get(Calendar.HOUR);
		System.out.println(hr+":"+min+":"+sec);
		
		int x=cl.get(Calendar.AM_PM);
		if (x==0){
			System.out.println("Good Morning");
		}
		else
			System.out.println("Good Evening");
		
	}

}
