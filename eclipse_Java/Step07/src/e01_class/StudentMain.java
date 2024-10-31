package e01_class;

public class StudentMain {

	public static void main(String[] args) {

		Student std1 = new Student(); // (인스턴스 / 객체) 학생 데이터 저장할 인스턴스 생성

		// 데이터 초기화 = 저장
//		std1.studentNo = "20111234";
//		std1.studentName = "홍길동";
//		std1.majorName = "컴퓨터공학과";
//		std1.score = 3.14;
//		System.out.println(std1.studentNo + " / " + std1.studentName + " / " + std1.majorName + " / " + std1.score);
		
		std1.init("20111234", "홍길동", "컴퓨터공학과", 3.14); // 메서드로 학생데이터 등록 ("20111234", "홍길동", "컴퓨터공학과", 3.14) : 인자값
		std1.printStudentInfo(); // 메서드(기능)으로 학생정보를 편하게 가져온다.
		
		Student std2 = new Student();
//		std2.studentNo = "20241234";	
//		std2.studentName = "마이콜";
//		std2.majorName = "디제잉과";
//		std2.score = 4.2;
//		System.out.println(std2.studentNo + " / " + std2.studentName + " / " + std2.majorName + " / " + std2.score);
		std2.init("20241234", "마이콜", "법학과", 4.2); //("20241234", "마이콜", "법학과", 4.2) : 인자값(arguments)
		std2.printStudentInfo();
		
		
	}

}
