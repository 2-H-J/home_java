package e05_interface;
/*
	인터페이스(Interface)
		- class의 대용 : class를 간소화 해둔 java코드
		- 서로다른 클래스들을 메서드(기능)으로 묶기 위해 나왔다.
		- 자바에서는 단일 상속만 허용하기 때문에 다른 언어의 다중 상속 효과를 준다.
		- 메모리 직접적으로 할당되지 않는다 (추상 class랑 똑같다)
			전역 상수, 추상 메서드, 디폴트 메서드(8버전 부터 추가됨)
*/
public interface InterA {
	
//	public double circleArea(int r) {
//		return r * r * 3.1415;
//	}
	
	// 전역 상수
	// public static final은 안써도 자동으로 붙어서 적용 된다.
	// public static final double PI = 3.1415;
	double PI = 3.1415;
	
	// 추상 메서드
	// public abstract 도 안써도 자동으로 붙어서 적용 된다.
	// public abstract void interA();
	void interA();
	
	// 디폴트 메서드 -> jdk8 버전 부터 지원
	default double circleArea(double r) {
		return r * r * PI;
	}
}
