package e02_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
		Map
			예) 금고가 있으면 Key(암호) value(내용) 모든걸 관리하는걸 Map이라고 한다
			- key값을 관리할 때 set을 사용(중복 되면 안되기 때문에)
	*/
	public static void main(String[] args) {
		HashMap<String, Point> map = new HashMap<String, Point>();
		//HasMap<키값 데이터 타입, 저장할 value>
		
		// map 데이터 추가
		map.put("A", new Point(2, 5));
		map.put("B", new Point(1, 3));
		map.put("Enemy", new Point(121, 58));
		map.put("Player", new Point(5, 10));
		map.put("B", new Point(3, 3));
		
		System.out.println(map);
		
		System.out.println("--------------------------------");
		// 데이터 꺼내기 - 키값 이용
		System.out.println(map.get("B"));
		System.out.println(map.get("Player"));
		
		System.out.println("--------------------------------");
		// 전체 데이터를 꺼내는 방법 - 1
		Set<String> key = map.keySet();
		for(String k : key) {
			System.out.println(k + " "+ map.get(k));
		}
		
		// 전체 데이터를 꺼내는 방법 - 2
		System.out.println("--------------------------------");
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k +" "+ map.get(k));
		}

		System.out.println("-----map 데이터 삭제(key)-----");
		// 데이터 삭제
		map.remove("A");
		for(String k : key) {
			System.out.println(k + " "+ map.get(k));
		}
		
		System.out.println("-----map 저장된 키-값 쌍의 개수-----");
		// 맵에 저장된 데이터 개수
		System.out.println(map.size());
		
		System.out.println("-----map 해당 key 있는지 -----");
		// 맵에 해당 키값이 있는지 있으면 true
		System.out.println(map.containsKey("A"));
		
		System.out.println("-----map 해당 value있는지-----");
		// 맵에 해당 데이터가 있는지 있으면 true
		System.out.println(map.containsValue(new Point(121, 58)));
		
		System.out.println("-----map 전체 삭제-----");
		// 맵에 내용 비우기
		map.clear();
		System.out.println(map);
		
		System.out.println("-----map 내용이 비었는지-----");
		// 맵에 내용이 비었는지
		System.out.println(map.isEmpty());
	}

}
