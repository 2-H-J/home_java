package e05_quest;

/*
 * Power를 상속받아서
 * 전원을 켜고 끌 때, TV 전원 On, Tv 전원 Off 출력되게끔 메서드 재정의
*/
public class TV extends Power{

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("TV 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("TV 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if(power) { // true -> On
			System.out.println("TV 전원 On");
		}else { // false -> Off
			System.out.println("TV 전원 Off");
		}
	}
	
	
	
}
