package e04_list;

import java.util.ArrayList;

public class StringListEx {

	public static void main(String[] args) {
		// 문자열 저장하는 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 문자열 데이터 5개 입력
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		// 데이터 삭제
		String result = list.remove(2);// 인덱스번호로 삭제(remove)하면 return값 String
		System.out.println("삭제된 데이터 : "+result); 
		System.out.println(list);
		
		System.out.println("값 있음 삭제 성공 : "+list.remove("D")); // Object값 지정 삭제하면 return값 boolean
		System.out.println(list);
		System.out.println("값 없음 삭제 실패 : "+list.remove("D"));
		
		// 전체 조회하는 반복문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------");
		for(String str : list) {
			System.out.println(str); 
		}
	}

}
