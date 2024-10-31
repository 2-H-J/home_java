package e04_join;

import java.util.Random;
import java.util.Vector;

public class DiceThread extends Thread{
	private static Vector<Integer> list = new Vector<Integer>();
	
	public static double getAverage() {
		//벡터에 저장된 숫자들의 평균을 리턴
//		int total = 0;
//		
//		for(int i=0;i<list.size();i++)
//			total += list.get(i);
//		
//		return (double)total / list.size();
		
		return list.parallelStream().reduce(0, (acc, curr) -> acc += curr)
				/ (double)list.size();
	}
	
	public DiceThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random r = new Random();
		int count = 0;
		
		while(true) {
			//주사위(1~6)를 두번 굴려서
			int dice1 = r.nextInt(6)+1;
			int dice2 = r.nextInt(6)+1;
			//주사위를 굴릴때마다 주사위를 굴린 횟수를 count에 저장
			count++;
			//각 주사위가 전부 6이 나올때까 굴림
			if(dice1 + dice2 == 12)
				break;
		}
		//벡터에 주사위 굴린 횟수 저장
		list.add(count);
		System.out.println(getName() + "@" + count);
	}
	
}



