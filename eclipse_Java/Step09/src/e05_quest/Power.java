package e05_quest;

/*
		전원 관리 클래스

			전원 값
			전원 on 메서드
			전원 off 메서드
			전원 on/off 메서드
 */
public class Power { // 전원 관리 클래스
	
	protected boolean power;
	
	// 전원On
	public void powerOn() {
		power = true;
//		System.out.println("전원On");
	}
	

	// 전원Off
	public void powerOff() {
		power = false;
//		System.out.println("전원Off");
	}
	
	
	public void powerOnOff() {
		power = !power;
		
	}
	
	
	
}
