package e09_calendar;

import java.util.Calendar;

public class FedexDateEx {

	public static void main(String[] args) {
		// 오늘 날짜 기준으로 택배가 영업일 기준 4일이 소모됨
		// 택배가 도착할 날짜를 계산해서 출력
		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.DAY_OF_MONTH, 5); // 5일 가정
		System.out.println("오늘날짜 : "+today.getTime());
		
		for(int i = 0; i < 4; i++) {
			today.add(Calendar.DAY_OF_MONTH, 1); // (필드, 증가수)
			
			switch (today.get(Calendar.DAY_OF_WEEK)){ // 주말 제외
			case Calendar.SATURDAY: 
			case Calendar.SUNDAY: 
				i--;
			}
			
		}
		System.out.println("택배 도착 예정 날짜: "+today.getTime());
		
		System.out.println("-------------------");
		//GPT
	       Calendar calendar = Calendar.getInstance();
	        System.out.println("오늘 날짜: " + calendar.getTime());

	        // 영업일 기준으로 추가할 일 수
	        int businessDays = 4;

	        // 영업일 계산 (주말 제외)
	        int addedDays = 0;
	        while (addedDays < businessDays) {
	            // 하루 더하기
	            calendar.add(Calendar.DAY_OF_MONTH, 1);
	            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	            
	            // 주말이 아닐 경우(월~금), 영업일로 카운트
	            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
	                addedDays++;
	            }
	        }

	        // 결과 출력
	        System.out.println("택배 도착 예정 날짜: " + calendar.getTime());
		
		
		
		
	}

}
