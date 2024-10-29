package e01_init;

import java.util.ArrayList;

public class ThreadMain {

	public static void main(String[] args) {
		ArrayList<ThreadRun> list = new ArrayList<ThreadRun>();
		
		//리스트에 Thread 10개 추가
//		for(int i = 0; i < 10; i++) {
//			list.add(new ThreadRun());
//		}
		while(list.size() < 10) {
			list.add(new ThreadRun());
		}
		
		//Thread에게 작업을 시작
		//start() 메서드로 작업을 시작
		
//		for(int i = 0; i < list.size(); i++) {
//			list.get(i).start();
//		}
		
		list.forEach(t -> t.start());
		
	}
}
