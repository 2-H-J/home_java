package e02_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetObjectExample {

	public static void main(String[] args) {
//		HashSet<Point> set = new HashSet<Point>();
		TreeSet<Point> set = new TreeSet<Point>(); // 에러 : class e02_collection.Point cannot be cast to class java.lang.Comparable
		
		// set에 Point 데이터 5건 저장, 그중 한건은 동일한 객체 저장?
		
			set.add(new Point(5, 10));
			set.add(new Point(20, 12));
			set.add(new Point(32, 25));
			set.add(new Point(42, 41));
			set.add(new Point(5, 10));
			set.add(new Point(10, 5));
			set.add(new Point(5, 9));
			set.add(new Point(11, 9));
			set.add(new Point(41, 42));
			
			// set에 내용을 출력
//			System.out.println(set);
			for(Point p : set) {
				System.out.println(p);
			}
	}

}
