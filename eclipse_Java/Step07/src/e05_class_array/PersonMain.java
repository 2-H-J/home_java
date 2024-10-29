package e05_class_array;

public class PersonMain {

	public static void main(String[] args) {
		// Person 타입 길이 5인 배열 생성
		
		Person[] arr = new Person[5];
		
		// 객체가 5번 만들어 지는게 아님
		// 객체를 저장할 변수가 5개 만들어짐
		
		arr[0] = new Person("김씨", 20);
		arr[1] = new Person("이씨", 40);
		arr[2] = new Person("정씨", 30);
		arr[3] = new Person("하씨", 60);
		arr[4] = new Person("박씨", 70);
		
		// 배열의 내용 전부 출력
		
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		}
		
/*

*/
}
