package e02_method;

/*
		-에어컨-
			온도 - int, 18 ~ 30
			바람세기 - int, 0 : 약 , 1 : 중 , 2 : 강, 3 : 자동
			운전모드 - int, 0 : 냉방, 1 : 제습, 2 : 송풍
			전원 - boolean, true : on, false : off
			
		-기능
			온도Up / Down
			바람세기변경
			운전모드변경
			전원On / Off
		
		
			초기화
*/
public class AirCon_Q {

	boolean power;
	int temp;
	int wind;
	int mode;
	
	// 온도
	final int MAX_TEMP = 30; // 최대
	final int MIN_TEMP = 18; // 최소
	// 바람
	final int WIND_POWER_1 = 0; // 약
	final int WIND_POWER_2 = 1; // 중
	final int WIND_POWER_3 = 2; // 강
	final int WIND_POWER_AUTO = 3; // 자동
	// 모드
	final int MODE_COLD = 0; // 냉풍
	final int MODE_DE = 1; // 제습
	final int MODE_BLOWING = 2; // 송풍
	
	void init() {
		// 초기화
		temp = MIN_TEMP; // 온도
		
	}
	
	// 온도 메서드
	void tempUp() {
		if(!power) return;
		if(temp < MAX_TEMP) temp++;
		System.out.println("현재 온도 : "+temp);
	}
	void tempDown() {
		if(!power) return;
		if(temp > MIN_TEMP) temp--;
		System.out.println("현재 온도 : "+temp);
	}
	
	// 바람 메서드
	void changeWind() {
		if(!power) return;
		wind = (wind + 1) % 4;
		switch(wind) {
		case WIND_POWER_1 :
			System.out.println("바람 세기 : 약");
			break;
		case WIND_POWER_2 :
			System.out.println("바람 세기 : 중");
			break;
		case WIND_POWER_3 :
			System.out.println("바람 세기 : 강");
			break;
		case WIND_POWER_AUTO :
			System.out.println("바람 세기 : 자동");
			break;
		}
	}
	
	// 모드 메서드
	void changeMode() {
		if(!power) return;
		mode = (mode + 1) % 3;
		switch(mode) {
		case MODE_COLD :
			System.out.println("모드 : 냉풍");
			break;
		case MODE_DE :
			System.out.println("모드 : 제습");
			break;
		case MODE_BLOWING :
			System.out.println("모드 : 송풍");
			break;
		}
	}
	
	// 전원 메서드
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원이 On");
		else
			System.out.println("전원 Off");
	}
	
	
}
