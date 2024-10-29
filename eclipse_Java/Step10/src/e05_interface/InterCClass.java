package e05_interface;

public class InterCClass extends InterAClass implements InterB {

	// InterB에 있던 InterA 추상메서드는 이미 상속한 부모 클래스에서 InterAClass에서 재정의가 되어 있어서
	// 굳이 강제로 재정의를 할 필요가 없다. ( 선택 사항)
	// 구현이 안된 interB만 강제로 재정의를 해야한다.
	
	public void interA() {
		System.out.println("InterC Class");
	}
	
	@Override
	public void interB() {
		// TODO Auto-generated method stub
		
	}
	
	

}
