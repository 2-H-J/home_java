package e07_quest;

public class Lamp implements Power{
	
	private boolean power;
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("Lamp 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("Lamp 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("Lamp 전원 On");
		}else {	
			System.out.println("Lamp 전원 Off");
		}
	}

	
	
}
