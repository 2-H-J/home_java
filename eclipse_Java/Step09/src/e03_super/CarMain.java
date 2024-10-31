package e03_super;

public class CarMain {
	
	public static void main(String[] args) {
		Avante a = new Avante();
		AvanteN aN = new AvanteN();
		
		for(int i = 0; i < 10; i++) {
			aN.SpeedAccerate();
		}
		
		aN.changeMode();
		
		for(int i = 0; i < 15; i++) {
			aN.SpeedAccerate();
		}
		
		for(int i = 0; i < 5; i++) {
			aN.SpeedBreak();
		}
	}
	
	
	
}
