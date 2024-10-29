package e02_method;

public class AirconMain {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		
		aircon.init();
		
		aircon.airPowerOnOff();
		aircon.airPowerOnOff();
		aircon.airPowerOnOff();
		
		aircon.fanSpeedUp();
		aircon.fanSpeedUp();
		
		aircon.fanSpeedDown();
		aircon.fanSpeedDown();
		aircon.fanSpeedDown();
		aircon.fanSpeedDown();
		aircon.fanSpeedDown();
		aircon.fanSpeedDown();
//		aircon.fanSpeedDown();
		
		aircon.airMode();
		aircon.airMode();
		aircon.airMode();
		
		aircon.tempUpH();
		
	}

}