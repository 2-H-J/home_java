package e08_diamond;

public interface D extends B, C{
	// Duplicate default methods named method1 with the parameters () and () are inherited from the types C and B : 중복된 method1
	public void methodD();
	
	@Override
	default void method1() {
		// TODO Auto-generated method stub
		B.super.method1();
		C.super.method1();
	}

}
