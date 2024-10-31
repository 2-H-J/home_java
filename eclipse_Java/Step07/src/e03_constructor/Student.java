package e03_constructor;

public class Student {
	String studentNo; // 학번 
	String studentNmae; // 이름
	String majorName; // 학과명
	double score; // 평점
	
	// 모든 필드를 초기화하는 생성자
	Student(String studentNo, String name, String major, double sc){ // <- 매개변수(중간역)
//		studentNo = studentNo; // 동일한 이름으로 초기화 하면 매개변수를 인식 객체에 저장이랑 연결이 안된다. 같은 명으로 할 경우 this. 를 부여
		this.studentNo = studentNo;
		// this. : 자기 자신 객체를 나타내는 키워드 / 매개변수와 필드명이 같으면 사용
//		studentNo = no;
		studentNmae = name;
		majorName = major;
		score = sc;
		
		
		
	}
	
	// 학생정보를 출력하는 메서드
	void StudentInfo() {
//		System.out.print("학생 : "+studentNo+" / 이름 : "+studentNmae+" / 학과명 : "+ majorName + " / 평점 : "+score+" \n");
		System.out.printf("%s / %s / %s / %f \n",studentNo, studentNmae, majorName, score);
	}
	
}
