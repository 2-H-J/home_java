package e04_inner;
/*
 * 중첩클래스	
 */	

//------Outer------
public class Outer {
	private int outer;

	public Outer(int outer) {
		this.outer = outer;
	}

	public void printOutter() {
		System.out.println("outter : " + outer);
	}

	
	//-------Inner-------
	public class Inner{
		private int inner;

		public Inner(int inner) {
			super();
			this.inner = inner;
		}
		
		public int sum() {
			return outer + inner;
			
			
		}
		
		public void printInner() {
			System.out.println(outer + " -> " + inner);
		}
		
	}// class Inner
	
	
} // class Outter
