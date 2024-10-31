package e01_generic;

public class GenericMain {

	public static void main(String[] args) {
//		GenericBox<Apple> appleBox = new GenericBox<Apple>();
		GenericBox<Apple> appleBox = new GenericBox<>();
		
		// 데이터를 넣고 꺼낼때 형변환이 필요없는 경우는
		// 제네릭(Generic)에서 생성시 타입을 지정을 했기 때문
		appleBox.setObj(new Apple());
		appleBox.getObj().printApple();
		
		
	}

}
