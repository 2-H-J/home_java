package e03_constructor;

public class AirCon_Q_Main {

	public static void main(String[] args) {
		AirCon_Q air = new AirCon_Q(18,30,17); // 온도 , 온도_최대, 온도_최소 값
											
		
//		air.init();
		
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
		for(int i = 0; i < 30; i++) {
			air.tempUp();
		}
	}

}
