package e05_quest;

public class Aircon extends Power{

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Aircon 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("Aircon 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if(power) { // true -> On
			System.out.println("Aircon 전원 On");
		}else { // false -> Off
			System.out.println("Aircon 전원 Off");
		}
	}

	
	
}
