package e09_calendar;

import java.util.Calendar;
import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		// 오늘 날짜부터 수능까지 몇일?
		// 오늘 날짜
		Date today = new Date("2024/10/01");
		System.out.println(today);
		
		// 수능 날짜 11/14
		Date soo = new Date(124, 10, 14);
		System.out.println(soo);
		
		// 오늘 날짜와 수능 날짜를 빼면 오늘 날짜부터 수능 날짜까지 시간값이 나옴
		// 하루 단위로 환산하면 수능날까지의 D-day가 나옴
		// 밀리초 -> 1000 -> 1초
		long dday = (soo.getTime() - today.getTime())/(1000*60*60*24); // 초,분,시간,일
		System.out.println(dday);
		
		System.out.println("-----------");
		
		// Calendar로 변경해서 출력
		Calendar t = Calendar.getInstance();
		System.out.println(t.getTime()); // 오늘
		
		Calendar s = Calendar.getInstance();
		s.set(2024, 10, 14); // 수능날
		System.out.println(s.getTime());
		
		System.out.println(s.get(Calendar.DAY_OF_YEAR) - t.get(Calendar.DAY_OF_YEAR));
		// get(Calendar.DAY_OF_YEAR)해당 년도에 총몇일인지
		
		
	}

}
