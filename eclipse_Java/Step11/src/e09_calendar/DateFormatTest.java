package e09_calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		//날짜 생성
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.DATE, 10);
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		//연도
		sdf.applyPattern("yyyy");// applyPattern : 날짜형식을 어떤 방식으로 보여줄지 yyyy-DD-dd(년-월-일)
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy"); // 두자리 연도
		System.out.println(sdf.format(cal.getTime()));
		
		// 월
		sdf.applyPattern("M"); // 한자리 월 / 만약 10~12월 두자리 월이면 그냥 두자리 다보임
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM"); // 두자리 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM"); // 세자리 월 : 로컬형식 월 약자
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM"); // 세자리 월 : 로컬형식 월 풀네임(국가가 외국이면 영어로)
		System.out.println(sdf.format(cal.getTime()));
		
		// 일
		sdf.applyPattern("d"); // 한자리 일 / 만약 월과 같이 두자리 일이면 두자리 보임
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd");// 두자리 일
		System.out.println(sdf.format(cal.getTime()));
		
		// 요일
		sdf.applyPattern("E"); // 요일 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEE"); // 요일 약자
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE"); // 요일 풀네임 월과 동일
		System.out.println(sdf.format(cal.getTime()));
		
		
		cal.set(Calendar.HOUR_OF_DAY, 7);
		// 24시간 기준
		sdf.applyPattern("H"); // 시간 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH"); // 시간 두자리
		System.out.println(sdf.format(cal.getTime()));
		
		//AM, PM
		sdf.applyPattern("a");
		System.out.println(sdf.format(cal.getTime()));
		
		// 12시간 기준
		sdf.applyPattern("h"); //한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("hh"); // 두자리
		System.out.println(sdf.format(cal.getTime()));
		
		cal.set(Calendar.MINUTE, 9);
		// 분
		sdf.applyPattern("m"); // 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm"); // 두자리
		System.out.println(sdf.format(cal.getTime()));
		
		cal.set(Calendar.SECOND, 5);
		// 초
		sdf.applyPattern("s"); // 한자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss"); // 두자리
		System.out.println(sdf.format(cal.getTime()));
		
		// 전체
		Calendar calendar = Calendar.getInstance();
		sdf.applyPattern("yy-M-d-E/(a)hh:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		//yyyy년 MM월 dd일 (am,pm)hh시 mm분 ss초
		sdf.applyPattern("yyyy년 MMM dd일 (a)hh시 mm분 ss초");
		System.out.println(sdf.format(calendar.getTime()));
		
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		// 지역변경
		sdf = new SimpleDateFormat("MMM MMMM E EEE EEEE", Locale.CHINA); // 월, 요일
		System.out.println(sdf.format(calendar.getTime()));
		
		
		
//		Date today = Calendar.getInstance().getTime();
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");
//		String formattedDate = dateFormat.format(today);
//		System.out.println("Formatted Date: " + formattedDate);
//		
//		String dateString = "2024-10-01";
//		try {
//			Date parsedDate = dateFormat.parse(dateString);
//			System.out.println("Parsed Date: " + parsedDate);
//		}catch (Exception e) {
//            e.printStackTrace();
//        }
		
	}

}
