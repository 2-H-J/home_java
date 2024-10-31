package e06_static;

/*
 * 싱글턴 패턴
 * 디자인 패턴 중 하나
 * 특정 클래스의 객체(인스턴스)가 프로그램내에서 하나만 생성되도록 보장
 * 그 객체(인스턴스)는 모든 클래스가 접근 할 수 있는 방법을 제공
 * 
 * 사용이유
 * 1. 시스템 전체에서 공유해야 되는 자원이나 설정 정보를 하나의 객체로 관리할 때 사용
 * 2. 하나의 객체로 관리하기때문에 객체 생성이 최소화 되니까 메모리 사용을 효율적으로 관리가 가능
 * 3. 어디서든 동일한 인스턴스에 접근할 수가 있다.
 */
public class Number {
	// 1. 싱글턴 패턴을 적용할 클래스를 private static 객체로 생성
	private static Number instance;
	
	// 필드
	private int num;
	
	// 2. 생성자는 private으로 선언해서 외부에서 인스턴스 생성을 막음
	private Number() {
		num++;
	}
	
	// 3. 1번에 있는 인스턴스를 반환(접근)하는 public static 메서드 작성
	public static Number getInstance() {
		if(instance == null) {
			instance = new Number();
		}
		return instance;
	}
	
	
	public int getNum() {
		return num;
	}
	
	
}
