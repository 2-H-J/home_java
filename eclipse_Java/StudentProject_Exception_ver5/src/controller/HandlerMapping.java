package controller;


//controller : 인력사무소? 작업의 시작점
//추가 작업자 + 삭제 작업자 + .....
//1. 사용자 데이터 입력 받기
//2. StudentService에 전달
//3. Service 결과 값을 받아서 화면 출력
public class HandlerMapping {
	
	// instance를 통해 클래스의 인스턴스가 단 하나만 생성
	// 클래스의 싱글턴 인스턴스를 저장할 정적 변수
	private static HandlerMapping instance;

	private HandlerMapping() {
	}
	
	
	public static HandlerMapping getInstance() {
		// // 인스턴스가 null이면, 아직 생성되지 않았음을 의미
		if(instance == null)
			// 새로운 StudentService 객체를 생성하고, instance 변수에 저장
			instance = new HandlerMapping();
		return instance;  // 이미 생성된 경우에는 기존 인스턴스를 반환
	}
	
	// 작업자를 생성해서 리턴하는 메서드(팩토리패턴)
	public Controller createController(int no) {
		Controller controller = null;
		
		switch(no) {
		case 1:
			controller = new StudentInsertController();
			break;
		case 2:
			controller = new StudentSearchController();
			break;
		case 3:
			controller = new StudentDeleteController();
			break;
		case 4:
			controller = new StudentUpdateController();
			break;
		case 5:
			controller = new StudentPrintAllController();
			break;
		case 6:
			controller = new StudentSearchNameController();
			break;
		}
		return controller;
	}
	
	
	
}
