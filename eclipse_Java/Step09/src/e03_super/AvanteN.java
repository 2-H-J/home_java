package e03_super;

public class AvanteN extends Avante{
	private boolean driveMode; // false - 일반 / true - 고속주행
	
	public void changeMode() {
		driveMode = !driveMode;
		if(driveMode) {
			// 고속 주행 모드로 전환 합니다.
			System.out.println("고속주행 모드on");
		}else {
			// 일반 주행 모드로 전환 합니다.
			System.out.println("일반주행 모드on");
		}
	}



	@Override
	public void SpeedAccerate() {
		if(gas < 1) {
			System.out.println("현재 연료가 없습니다. 채워주세요.");
			return;
		}
		
		// 고속주행 모드면 속도증가 15, 연료랑 3씩 감소
		if(driveMode) {
		speed += 15;
		
		if(speed > 240) {
			speed = 240;
			System.out.println("최고속도 도달");
		}
		gas -= 3;
		System.out.println("액셀을 밟았습니다.");
		System.out.println("현재 속도 : "+speed+ " km/h - 남은 연료 : "+gas);
		}else {
			// 일반주행 모드면 부모에서 쓰던 기능 그대로
			super.SpeedAccerate();
		}
	}


	@Override
	public void SpeedBreak() {
		// TODO Auto-generated method stub
		super.SpeedBreak();
	}

	
	
}
