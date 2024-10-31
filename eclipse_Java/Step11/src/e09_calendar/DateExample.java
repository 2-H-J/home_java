package e09_calendar;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime()); // 밀리초
		date.setTime(0);
		System.out.println(date);
		
		Date end = new Date(124, 11, 31); // 1900 년 기준으로 계산
		System.out.println(end);
		
	
			
	}

}
