package e06_static;


public class StaticVar {
	/*
	 * static으로 선언된 변수나 메서드는 메타영역에 저장
	 * 메타영역은 정적인 메모리로 프로그램시작부터 끝날때까지 유지되는 메모리
	 * 장점 : 프로그램 시작부터 끝날때까지 유지가 되니까, 어느곳에서나 접근이 가능 단, public 인경우
	 */
//		Math.PI :   public static final double PI = 3.141592653589793; public(누구나) static(미리 메모리할당 항상) final(변경불가)

	public static int n1 = 10; // 미리 static으로 메모리를 할당해서 사용가능
	public int n2 = 20; // StaticVar 생성자를 
	
	public static void main(String[] args) {
		// static 키워드가 붙어있으면 미리 메모리가 할당 되었기 때문에 접근이 가능하다.
		System.out.println(n1);
		
		// n2는 StaticVar 클래스의 필드이기 때문에 아직 생성이 안되어 접근이 불가능 하다.
		// static을 선언하지 않으면 사용이 불가능
//		System.out.println(n2);
		// non-static은 반드시 생성 후에 실행한다. Cannot make a static reference to the non-static field n2
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		
		System.out.println("-------------------");
		// static으로 선언한걸 접근하는 방법 ( 외부에서 접근하는 과정 )
		
		// static으로 선언된 변수나 상수, 메서드에 접근하는 방법
		// 클래스명.변수명, 클래스명.상수명, 클래스명.메서드()
		System.out.println(StaticVar.n1);
		System.out.println(Math.PI);
		
		// 객체명.변수명, 객체명.상수명, 객체명.메서드()
		System.out.println(var.n1);
		
		
	}

}
