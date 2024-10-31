package outer_inner;
/*
	1.Outer 클래스는 기본적으로 일반적인 클래스입니다.
	Inner 클래스(내부 클래스)는 이 Outer 클래스 내부에 선언됩니다.
	즉, Inner 클래스는 Outer 클래스의 멤버로 간주됩니다.-
	외부 클래스는 객체를 생성하거나 필드, 메서드 등을 가질 수 있으며,
	Inner 클래스는 이 외부 클래스에 종속되어 있는 형태입니다.
*/

public class Outer {
	private String outerField = "Outer class Field";
	
	public void outerMethod() {
		System.out.println("This is an outer class method");
	}// outerMethod
/*
	 이 예시에서는 Outer 클래스가 기본적인 필드와 메서드를 포함하고 있습니다. 
	 특별한 점은 없으며, 다른 일반 클래스와 동일하게 사용됩니다.
*/
/*
	2. Inner 클래스 (내부 클래스)
	Inner 클래스는 Outer 클래스 내부에 정의된 클래스입니다. 
	Inner 클래스는 보통 외부 클래스와 밀접한 관련이 있는 기능을 수행할 때 사용됩니다. 
	외부 클래스와 내부 클래스는 서로 긴밀한 관계를 가지며, 
	*내부 클래스는 외부 클래스의 멤버(필드와 메서드)에 쉽게 접근할 수 있습니다.

	Inner 클래스의 종류:
	Non-static Inner Class (정적이 아닌 내부 클래스)
	Static Nested Class (정적 중첩 클래스)
	Local Inner Class (지역 내부 클래스)
	Anonymous Inner Class (익명 내부 클래스)
*/
	public class Inner{
		private String innerField = "Inner Field";
		
		public void display() {
			//Inner 클래스에서 Outer 클래스의 멤버에 접근 가능
			System.out.println("outerField : " + outerField);
			System.out.println("Inner field: " + innerField);
		}
	}//class Inner
	
	public void createInner() {
		//Outer클래스에서 Inner 클래스를 생성
		Inner inner = new Inner();
		inner.display();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();// Outer 클래스 인스턴스 생성
		outer.createInner();// Inner클래스의 메서드 호출
	}
	
}//class Outer
