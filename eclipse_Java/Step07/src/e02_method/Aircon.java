package e02_method;

public class Aircon {
	
/*
 	Q1. 에어컨 클래스 - 온도 설정, 바람세기, 운전 모드, 전원
	AirCon
	전원 on / off
	바람 업다운
	온도 업다운
	모드 냉방/난방/ 냉방 16~30 / 난방 25~40

	데이터
		전원 - boolean / 모드 - boolean / 바람 - int / 온도 - int
		
	데이터 범위
		전원 : true - ON / false - OFF
		모드 : 냉방 / 난방
		바람 : 최대 바람 세기 5 / 최소 바람 세기 1
		온도 : 냉방 : 최소 16, 최대 30 / 난방 : 최소 25, 최대 40
	
	기능
		전원	On / Off
	 	모드	냉방 / 난방
		바람	Up / Down
		온도	Up / Down
*/

	boolean airconPower;
	boolean airconMode;
	int temperature;
	int airconFanSpeed;
	
	// 최대 최소 바람단계
	final int MAX_FANSPEED = 5;
	final int MIN_FANSPEED = 1;
	
	// 최대 최소 온도(난방)
	final int MAX_TEMPH = 40;
	final int MIN_TEMPH = 25;
	// 최대 최소 온도(냉방)
	final int MAX_TEMPI = 28;
	final int MIN_TEMPI = 16;
	

	// 1. 초기화------------------------------------------------------------------------------
	void init() {
		airconFanSpeed = 4; // 바람 세기 ( 1 ~ 5 단계)
		temperature = 16; // 온도 ( 냉방 : 16 ~ 28)(난방 : 25 ~ 40)
	}

//	전원 ------------------------------------------------------------------------------
	void airPowerOnOff() {
		airconPower = !airconPower;

		if (airconPower) {
			System.out.println("에어컨 On");
		} else
			System.out.println("에어컨 Off");
	}

//	모드 ------------------------------------------------------------------------------
	void airMode() {
		if (!airconPower)
			return;
		airconMode = !airconMode;
		
		if(airconMode) {
			System.out.println("냉방");
			
		}else {
			System.out.println("난방");
		}
		
	}
	
//	바람세기 ------------------------------------------------------------------------------
	void fanSpeedUp() {
		if (!airconPower)
			return;
		
		airconFanSpeed++;
		if(airconFanSpeed > 5) {
			System.out.println("최대단계");
		}else
		System.out.println("현재 바람 세기 : "+airconFanSpeed+" 단계");
		
	}
	void fanSpeedDown() {
		if (!airconPower)
			return;
		airconFanSpeed--;
		if(airconFanSpeed < 1) {
			System.out.println("최소단계");
			return;
		}else
		System.out.println("현재 바람 세기 : "+airconFanSpeed+" 단계");
		
	}
	
//	온도 ------------------------------------------------------------------------------
//	냉방 기준 냉방 16 ~ 30
	void tempUpI() {
		if (!airconPower)
			return;
		
		
	}
	void tempDownI() {
		if (!airconPower)
			return;
		
	}
//	난방 기준 난방 25 ~ 40
	void tempUpH() {
		if (!airconPower)
			return;
		
		temperature++;
		if(temperature <= MAX_TEMPH) {
			System.out.println("최대온도");
		}else
			System.out.println("설정 온도 : "+temperature+"도");
	}
	void tempDownH() {
		if (!airconPower)
			return;
		
		temperature--;
		if(temperature > MIN_TEMPH) {
			System.out.println("최소온도");
		}else
			System.out.println("설정 온도 : "+temperature+"도");
		
	}
	

}