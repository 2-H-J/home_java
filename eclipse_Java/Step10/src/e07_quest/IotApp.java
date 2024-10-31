package e07_quest;

import java.util.ArrayList;

public class IotApp implements Power{
	
	private ArrayList<Power> list;
	boolean power;
	public IotApp() { // 생성자
		list = new ArrayList<Power>();
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Lamp());
	}
	
	// 전체 전원 On
	public void powerAllOnDevice() {
		System.out.println("[ Iot 모든 기기 On ]");
		for(Power on : list) {
			on.powerOn();
		}
		System.out.println("---------------------");
//		또는 
//		for (int i = 0; i < list.size(); i++) {
//			list.get(i).powerOn();
//		}
		
	}
	
	
	// 전체 전원 Off
	public void powerAllOffDevice() {
		System.out.println("[ Iot 모든 기기 Off ]");
		for(Power off : list) {
			off.powerOff();
		}
		System.out.println("---------------------");
		
	}
	
	// 새기기 추가 - 인자값으로 Power를 상속받은 인스턴스들이 들어옴?
	public void addDevice(Power device) { // Power device 로 상속 받은 새기기 
		list.add(device);
	}
//	또는
//	public boolean addDevice(Power device) {
//		return list.add(device);
//	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOnOff() {
		// TODO Auto-generated method stub
//		if(power = !power) {
//			System.out.println("Aircon 전원 On");
//			
//		}else { // false -> Off
//			System.out.println("Aircon 전원 Off");
//		}
		
	}
	

}
