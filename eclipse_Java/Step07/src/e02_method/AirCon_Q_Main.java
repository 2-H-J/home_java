package e02_method;

public class AirCon_Q_Main {

	public static void main(String[] args) {
		AirCon_Q air = new AirCon_Q();
											
		
		air.init();
		
		air.powerOnOff();
		air.powerOnOff();
		air.powerOnOff();
		
		air.changeWind();
		air.changeWind();
		air.changeWind();
		air.changeWind();
		
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
	
		air.tempUp();
		air.tempUp();
		air.tempUp();
		air.tempUp();
//		for(int i = 0; i < 30; i++) {
//			air.tempDown();
//		}
	}

}
