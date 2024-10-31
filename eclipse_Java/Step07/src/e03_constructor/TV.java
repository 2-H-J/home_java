package e03_constructor;


/*
		TV
		전원 on / off
		채널 업다운
		음량 업다운
		음소거 

		데이터
			음량 - int / 채널 - int / 전원 - boolean / 음소거 - boolean
			
		데이터 범위
			음량 : 0 ~ 100
			채널 데이터 범위 : 1 ~ 766
			전원 : true - ON / false - OFF
			음소거 : true - ON / false - OFF
		
		기능
			전원	On / Off
		 	음소거	On / Off
			음량	Up / Down
			채널	Up / Down
 */
public class TV {
	int tvChannel; // 채널 번호
	boolean tvMuted; // 음소거 상태
	int tvVolume; // 음량 크기
	boolean tvPower; // 전원 상태
	final int MAX_TV_CHANNEL; // 상수 final 선언 채널 최대 최소 지정
	final int MIN_TV_CHANNEL = 1;
//	final int MAX_TV_VOLUME = 100;
	final int MAX_TV_VOLUME; // 필드에서 초기화를 안하면 생성자에서 초기화
	final int MIN_TV_VOLUME = 0;

	public TV(int tvChannel, int tvVolume, int MAX_TV_CHANNEL) { // 생성자를 통한 초기화 init 초기화가 없어도 된다
		this.tvChannel = tvChannel;
		this.tvVolume = tvVolume;
		this.MAX_TV_CHANNEL = MAX_TV_CHANNEL;
		// final로 선언된 필드는 선언시 초기화를 안한다면
		// 생성자에서 반드시 초기화 시켜줘야함
		MAX_TV_VOLUME = 100;
	}

	// 1.
	// 초기화------------------------------------------------------------------------------------
//	void init() {
//		tvChannel = 2;
//		tvVolume = 1;
//	}

	// 2.
	// 기능------------------------------------------------------------------------------------

//	전원 On/Off
	void powerOnOff() {
		// 메서드를 실행 할때마다 전원이 켜졌다가 꺼졌다가 해야함
		// 전원 값이 true --> TV 전원 On
		// 전원 값이 false --> TV 전원 Off

		tvPower = !tvPower;
//		if(tvPower == true)
//			tvPower = false;
//		else 
//			tvPower = true;
//
		if (tvPower)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}

//	채널 Up------------------------------------------------------------------------------------
	void channelUp() {
//		Scanner sc = new Scanner(System.in);
//		tvChannel = sc.nextInt();
		// 메서드 실행시 채널 1씩 증가
//		tvChannel++;

		// 채널의 값이 최대값일때 증가하면 1번으로 이동
//		if(tvChannel > 766) tvChannel = 1;
		if (!tvPower)
			return;

		tvChannel = tvChannel % MAX_TV_CHANNEL + 1;

		// 현재 채널 번호 출력
		System.out.println("현재 채널 : " + tvChannel);
	}

//	채널 Down------------------------------------------------------------------------------------
	void channelDown() {
		if (!tvPower)
			return;

//		tvChannel--;

//		if(tvChannel==0) {
//			tvChannel = 766;
//		}

		tvChannel = tvChannel == MIN_TV_CHANNEL ? MAX_TV_CHANNEL : tvChannel - 1;
		System.out.println("현재 채널 : " + tvChannel);
	}

//	음소거 On/Off------------------------------------------------------------------------------------
	void tvMutedOnOff() {
		if (!tvPower)
			return;

		tvMuted = !tvMuted;

//		if (tvMuted)
//			System.out.println("음소거 On");
//		else
//			System.out.println("음소거 Off");
//		
		System.out.println(tvMuted ? "음소거 On" : "음소거 Off");
	}

//	음량 Up------------------------------------------------------------------------------------
	void tvVolumeUp() {
		if (!tvPower) // TV 전원이 꺼져 있으면 실행되지 않게 리턴
			return;
//		음소거중 음량을 올리거나 내리면 음소거가 풀린다.
		if (tvMuted) // TV음소거가 실행(true)면 음소거 메소드 재실행
			tvMutedOnOff();
		if (tvVolume < MAX_TV_VOLUME) {
			tvVolume++;
			System.out.println("최대");
		}
		System.out.println("현재 볼륨 : " + tvVolume);
	}

//	음량 Down----------------------------------------------------------------------------------
	void tvVolumeDown() {
		if (!tvPower)
			return;
//			음소거중 음량을 올리거나 내리면 음소거가 풀린다.
		if (tvMuted)
			tvMutedOnOff();

		if (tvVolume > MIN_TV_VOLUME) {
			tvVolume--;
			System.out.println("최소");
		}
		System.out.println("현재 볼륨 : " + tvVolume);

	}
}
