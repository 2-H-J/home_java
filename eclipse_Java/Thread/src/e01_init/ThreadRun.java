package e01_init;


/*
	Thread : 쓰레드 클래스
	run() : 동시에 작업을 수행하게 하는 메서드
	start() : 쓰레드에게 지금부터 작업을 시작하라는 명령

*/
public class ThreadRun extends Thread {
	
	
	@Override
	public void run() { // 자동으로 Thread가 일하는 부분
		for(int i = 0; i < 50; i++) {
//			System.out.println(i + "번째 일 - "+ getName() +" / 일한 시간 : "+sdf.format(Calendar.getInstance().getTime())); 
			// getName() : 어떤 Thread가 일하는지 이름 메서드
			System.out.println(i + "번째 일 - "+ getName() +
					" / 일한 시간 : "+System.nanoTime()); // getName() : 어떤 Thread가 일하는지 이름 메서드
		}
		System.out.println("Thread종료");
	}// 일하는게 끝나면 자동 종료
	
	
	
	
}
