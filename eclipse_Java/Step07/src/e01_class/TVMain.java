package e01_class;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();

//		tv.init();

//		TV 전원 On / Off
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
//--------------------------------------------
//		TV 채널 Up
//		for (int i = 0; i <= 766; i++) {
//			tv.channelUp();
//		}
//		tv.channelUp();
//		tv.channelUp();
//--------------------------------------------
//		TV 채널 Down
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
//--------------------------------------------
//		TV 음소거 On / Off
		tv.tvMutedOnOff();
//		tv.tvMutedOnOff();
//		tv.tvMutedOnOff();
//--------------------------------------------
//		TV 음량 Up
		tv.tvVolumeUp();
//		tv.tvVolumeUp();
//--------------------------------------------
//		TV 음량 Down
		tv.tvVolumeDown();
		tv.tvVolumeDown();
		tv.tvVolumeDown();
		
	}
	
	
}
