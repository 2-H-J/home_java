package e04_inner;

public class OuterStaticInnerClass {
	private int outer;
	private static int n  = 100;

	public OuterStaticInnerClass(int outer) {
		this.outer = outer;
	}
	
	public static class InnerStaticClass{ // static 메모리 미리 할당
		private int inner;
//		private static int no = 20;

		public InnerStaticClass(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			
			// Inner클래스가 static이기 때문에 누구의 outer 필드(변수)인지 모름
			// static은 none static에 접근할 수 없다.
			return n + inner;
		}
		
	}// InnerStaticClass
	
	
}// OuterStaticInnerClass
