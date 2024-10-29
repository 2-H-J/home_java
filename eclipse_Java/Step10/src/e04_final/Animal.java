package e04_final;

//The type Person cannot subclass the final class Animal : class에 final키워드가 붙으면 해당 클래스를 상속받을 수 없다.
public final class Animal {
	
	// final이 붙이 메서드는 오버라이딩을 금지 시킨다.
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}

}
