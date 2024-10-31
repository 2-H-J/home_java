package e05_quest;

public class Boiler extends Power{
	
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Boiler 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("Boiler 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if(power) { // true -> On
			System.out.println("Boiler 전원 On");
		}else { // false -> Off
			System.out.println("Boiler 전원 Off");
		}
	}

}
