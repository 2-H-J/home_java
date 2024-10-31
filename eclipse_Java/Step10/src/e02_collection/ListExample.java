package e02_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	/*
	 * 		List 특징
	 * 			1. 데이터 중복 가능
	 * 			2. 리스트에 저장된 데이터 순서가 보장된다.
	 * 
	 * 		ArrayList : list에서 데이터를 배열로 관리
	 * 		LinkedList : list에서 데이터를 노드 단위로 관리 (추가 삭제로 괜찮지만, 검색용으로 효율적이지 않다 )
	 * 		Vector : ArrayList와 동일, 동기화가 추가 ( 동기화 : 공용메모리중 다른 사람이 사용 불가 하게? 한번에 한명만 사용 가능)
	*/
	public static void main(String[] args) {
		
		// 리스트 생성
		// ArrayList<리스트에 저장할 데이터 타입(참조형타입만)>
//		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		
		// 데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("jsp");
		list.add("java");
		list.add("react");
		list.add("jsp");
		System.out.println(list);
		
		System.out.println("\n---------데이터 삭제 - 인덱스 번호로 삭제--------");
		// 데이터 삭제 - 인덱스 번호로 삭제
		list.remove(2);
		System.out.println(list);
		
		System.out.println("\n-----데이터 삭제 - 데이터 값을 기준으로 삭제-----");
		// 데이터 삭제 - 데이터 값을 기준으로 삭제, 첫번째로 검색된 값 1개만 삭제
		list.remove("jsp");
		System.out.println(list);
		
		System.out.println("\n---------리스트에 저장된 데이터 개수----------");
		// 리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		System.out.println("\n-------특정 인덱스 데이터 변경, 추가---------");
		// 리스트에 저장된 특정 인덱스의 데이터 변경  (element : 요소)
		list.set(1, "C");
		System.out.println(list);
		
		// 리스트에 특정 인덱스에 데이터 추가 기존 인덱스는 뒤로 밀린다.(기존데이터 삭제 X , 끼워 넣기)
		list.add(1, "C++");
		System.out.println(list);
		
		System.out.println("\n---------해당 데이터를 리스트에서 검색-------------");
		// 해당 데이터를 리스트에서 검색 ( true / false 로 있다 없다로 알 수 있음)
		System.out.println(list.contains("react"));
		System.out.println(list.contains("sql"));
		
		System.out.println("\n---------데이터가 몇번째 위치에 있는지--------");
		// 데이터가 몇번째 위치에 있는지 ( 데이터가 없다면 -1, 데이터가 있다면 인덱스 번호로 )
		System.out.println(list.indexOf("react"));
		System.out.println(list.indexOf("sql"));
		
		System.out.println("\n-------리스트에 있는 모든 데이터를 삭제-------");
		// 리스트에 있는 모든 데이터를 삭제
		list.clear();
//		list.removeAll(list);
		System.out.println(list);
		
		System.out.println("\n-------리스트에 데이터가 없는지 검색-------");
		// 리스트에 데이터가 있는지 검색 ( true / false 로 있다 없다로 알 수 있음)
		System.out.println(list.isEmpty());
		list.add("C++");
		System.out.println(list.isEmpty());
		
		System.out.println("\n--------리스트에 있는 데이터 꺼내는 방법(1)---------");
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("jsp");
		list.add("react");
		//리스트에 있는 데이터 꺼내는 방법 - 1
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i)); // 인덱스 번호를 이용해서 꺼낸다
		}
		
		System.out.println("\n--------리스트에 있는 데이터 꺼내는 방법(2)---------");
		// 리스트에서 데이터 꺼내는 방법 - 2
		// for each 문 데이터를 리스트에서 복사 받아서 이용 ( 특정 데이터를 바꾸는 방법으로는 적절하지 않음)
		for(String str : list) { // list를 str로 복사해서
			System.out.println(str);
		}
		
		System.out.println("\n--------리스트에 있는 데이터 꺼내는 방법(3)---------");
		// 리스트에서 데이터를 꺼내는 방법 - 3
		// Collection이 공통적으로 데이터를 처음부터 마지막까지 접근할 때 사용 : 반복자(Iterator)
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // hasNext : 다음 위치에 데이터 값이 있는지 있으면 true 없으면 false
			System.out.println(it.next()); // .next() 있는 데이터를 리턴
		}
		
	}

}
