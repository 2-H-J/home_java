package e04_list;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		//리스트 생성
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		//데이터 추가
		list.add(20);
		list.add(1);
		list.add(55);
		list.add(65);
		list.add(34);
		list.add(27);
		System.out.println(list);
		
		//저장된 데이터 개수
		System.out.println("리스트에 저장된 값 개수 : " + list.size());
		
		System.out.println("--------------------------------------");
		//데이터 전체 조회
//		System.out.println(list.get(0));
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------");
		//데이터 삭제 - index를 이용해서 삭제
		list.remove(3);
		//데이터 삭제 - 동일한 값에 해당하는 데이터 삭제
		list.remove(new Integer(20));
		System.out.println(list);
		
		
	}

}







