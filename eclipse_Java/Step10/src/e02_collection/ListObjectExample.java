package e02_collection;

import java.util.ArrayList;

public class ListObjectExample {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		
		// 리스트에 데이터 10건
		for(int i = 1; i <= 10; i++	) {
			list.add(new Point(i, i * 10));
		}
//		System.out.println(list);
		
//		for(Point p : list) {
//			System.out.println(p);
//		}
		
		
		Point search = new Point(1,10);
		for(Point p : list) {
			System.out.println(p);
		}
		System.out.println(list.contains(search));
		System.out.println(list.indexOf(search));
		
		System.out.println(list.remove(search));
	}

}
