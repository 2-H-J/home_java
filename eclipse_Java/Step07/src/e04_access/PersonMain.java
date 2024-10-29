package e04_access;

public class PersonMain {

	public static void main(String[] args) {
		Person ps1 = new Person("정상수", 100);
		
		
//		ps1.age = 50;
		// 접근제어자 : 지정한 사람외 데이터 값을 변경하지 못하도록 접근제어자 private으로 변경하지 못하도록 할 수 있다.
		ps1.setPersonName("정수");
		ps1.setAge(40); // 메서드를 통해 값을 넣는다
		System.out.println(ps1);
		System.out.println(ps1.getAge()); // 메서드를 통해 값을 가져온다
		System.out.println(ps1.getPersonName()); // 메서드를 통해 값을 가져온다
	}
}
  