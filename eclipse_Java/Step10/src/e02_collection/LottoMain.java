package e02_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		// TreeSet : 중복데이터 저장X, 자동 정렬
		
		Random r = new Random();
		
		// 로또 번호 1 셋트 생성
//		for(int i = 0; i < 6; i++) {
//			set.add(r.nextInt(45)+1);
//		}
		while(set.size() < 6) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
	}

}
