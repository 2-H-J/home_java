package e07_quest;

public class IotMain {

	public static void main(String[] args) {
		IotApp app = new IotApp();
		
		app.powerAllOnDevice();
		
		app.powerAllOffDevice();
		
		app.addDevice(new TV()); // 새기기 추가
		app.powerAllOnDevice();
		
		app.addDevice(new Boiler());
		app.powerAllOnDevice();
		app.powerAllOnDevice();
		app.powerAllOffDevice();
		
		app.powerOnOff();
	}

}
