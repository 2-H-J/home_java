package e06_static;

public class StudentMain {

	public static void main(String[] args) {
		
//		학생정보 배열로 생성 / 객체를 저장할 변수가 5개 만들어짐
		Student[] st = new Student[5];
		
		// 매개변수를 이름, 학과, 평점 세개 등록하여 입력
		st[0] = new Student("홍씨", "컴공", 3.4);
		st[1] = new Student("김씨", "복지", 2);
		st[2] = new Student("이씨", "법학", 4);
		st[3] = new Student("박씨", "방송", 2.5);
		st[4] = new Student("지씨", "간호", 3);
		
//		등록된 학생정보 반복문 출력
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
			}
		
		System.out.println("--------------------------------------------------------------------------------");
		
//		접근제어자 get으로 이름만 호출
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i].getStudentName());
		}

//		접근제어자 set으로 기존 학생[2]값 이름 이씨 -> 정씨로 변경
		st[2].setStudentName("정씨");
		System.out.println(st[2]);
		
		
		
	}
}
