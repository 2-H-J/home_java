package e03_super;

public class Avante {
	// 연료량 - 0 ~ 100
	protected int gas;
	
	// 현재 속도 - 0 ~ 240
	protected int speed;
	
	public Avante() {
		gas = 100;
		speed = 0;
	}
	
	

	// 엑셀 - 밟을때 마다 속도를 5씩 증가
	public void SpeedAccerate() {
		if(gas < 1) {
			System.out.println("현재 연료가 없습니다. 채워주세요.");
			return;
		}
		
		speed += 5;
		if(speed > 240) {
			speed = 240;
		}
		gas -= 2;
		System.out.println("액셀을 밟았습니다.");
		System.out.println("현재 속도 : "+speed+ " km/h - 남은 연료 : "+gas);
	}
	
	// 브레이크 - 밟을때 마다 속도 5씩 감소
	public void SpeedBreak() {
		speed -= 5;
		if(speed <= 0 || speed - 5 <= 5) {
			speed = 0;
		}
		gas -= 1;
		System.out.println("브레이크를 밟았습니다.");
		System.out.println("현재 속도 : "+speed+ " km/h - 남은 연료 : "+gas);
	}
}
