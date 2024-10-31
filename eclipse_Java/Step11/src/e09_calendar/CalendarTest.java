package e09_calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		// 연도
		System.out.println("년 - "+calendar.getWeekYear());
		System.out.println("년 - "+calendar.get(Calendar.YEAR));
		// 월
		System.out.println("월 - "+calendar.get(Calendar.MONTH)+1); // 1월 0번 9월 8번
		// 일
		System.out.println("일 - "+calendar.get(Calendar.DAY_OF_MONTH));
		// 요일
		System.out.println("요일 - "+calendar.get(Calendar.DAY_OF_WEEK)); // 1 ~ 7 : 일욜~토욜
		// 12시간 기준
		System.out.println("오전(0),오후(1) - "+calendar.get(Calendar.AM_PM)); // 오전 0 - 오후 1
		System.out.println("시간(12) - "+calendar.get(Calendar.HOUR));
		// 24시간 기준
		System.out.println("시간(24) - "+calendar.get(Calendar.HOUR_OF_DAY));
		// 분
		System.out.println("분 - "+calendar.get(Calendar.MINUTE));
		// 초
		System.out.println("초 - "+calendar.get(Calendar.SECOND));
		// 밀리초
		System.out.println("밀리초 - "+calendar.get(Calendar.MILLISECOND));
		
		calendar.set(Calendar.YEAR,	2025);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH,	32); // 다음달 + 2
		calendar.set(Calendar.DAY_OF_MONTH,	-1); // 전달
		System.out.println(calendar.getTime());
		
		calendar.setTimeInMillis(0);
		System.out.println(calendar.getTime());
		
		
		
		
	}

}
