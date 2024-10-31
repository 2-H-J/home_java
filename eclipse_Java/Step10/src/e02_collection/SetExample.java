package e02_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * 	-Set
	 * 		1. 데이터를 중복해서 저장하지 않음
	 * 		2. 자동 정렬
	 * 		3. 인덱스 번호로 관리 할 수 없음
	 * 		
	 * 	
	*/
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		// 추가
		System.out.println("----------추가 내용----------");
		set.add("HTML");
		set.add("CSS");
		set.add("JAVA");
		set.add("React");
		set.add("JSP");
		set.add("CSS"); // 중복이 안들어감
		System.out.println(set.add("Oracle")); // 데이터가 들어가면 true
		System.out.println(set.add("Oracle")); // HashSet은 중복저장이 안되니 중복된 데이터가 들어가면 false
		System.out.println(set);
		
		// 삭제
		System.out.println("----------내용 삭제----------");
		set.remove("React");
		System.out.println(set);
		
		// 데이터 개수
		System.out.println("----------내용 개수----------");
		System.out.println(set.size());
		
		// 데이터 검색
		System.out.println("----------내용 검색----------");
		System.out.println(set.contains("JAVA")); // contains : 내용검색 있으면 true 없으면 false
		
		// 내용 비우기
		System.out.println("----------전체 삭제----------");
		set.clear();
		System.out.println(set);
		
		// set이 비어 있는지(리스트 내용)
		System.out.println("----------데이터 OX----------"); // 비어 있으면 true / 내용이 잇다면 false
		System.out.println(set.isEmpty());

		
		System.out.println("----------전체 조회-1---------"); 
		set.add("HTML");
		set.add("CSS");
		set.add("JAVA");
		set.add("React");
		set.add("JSP");
		set.add("CSS");
		// 데이터 전체 조회 -1
		for(String str : set) {
			System.out.println(str);
		}
//		Iterator<String> iterator = set.iterator();
//		if(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
		System.out.println("----------전체 조회-2---------"); 
		// 데이터 전체 조회 -2
		Iterator<String> it = set.iterator(); // Collection이 공통적으로 데이터를 처음부터 마지막까지 접근할 때 사용 : 반복자(Iterator)
		
		while(it.hasNext()) { // hasNext : 다음 위치에 데이터 값이 있는지 있으면 true 없으면 false
			System.out.println(it.next()); // .next() 있는 데이터를 리턴
		}
		
		// set을 list로 변환 할 수 있다.
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
		// list을 set으로 변환
		HashSet<String> hash = new HashSet<String>(list);
		System.out.println(hash);
		
	}

}
