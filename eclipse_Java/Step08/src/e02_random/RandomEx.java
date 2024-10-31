package e02_random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10));
		System.out.println(r.nextFloat());
		System.out.println(r.nextBoolean());
		
		// seed 값이 같으면 실행 할때마다 나오는 숫자가 동일하다.
		Random t = new Random(System.currentTimeMillis()); // System 현재시간으로 숫자를 계속 바꾼다.
		for(int i = 0; i < 5; i++) {
			System.out.println(t.nextInt(45));
		}
		
	}

}
