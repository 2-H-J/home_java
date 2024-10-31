package e04_join;

import java.util.ArrayList;

public class DiceMain {

	public static void main(String[] args) {
		ArrayList<DiceThread> list = new ArrayList<DiceThread>();
		
		//DiceThread 5개 생성해서 리스트에 저장
		for(int i=0;i<1000;i++)
			list.add(new DiceThread("스레드"+i));
		//리스트에 저장한 스레드 실행
		list.forEach(t -> t.start());
		
		list.forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		//DiceThread에 있는 getAverage 실행해서 평균 횟수를 출력
		System.out.println("6-6 더블 평균 횟수 : " + DiceThread.getAverage());
	}

}






