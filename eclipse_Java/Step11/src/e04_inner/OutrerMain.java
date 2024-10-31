package e04_inner;

import e04_inner.Outer.Inner;
import e04_inner.OuterStaticInnerClass.InnerStaticClass;

public class OutrerMain {
	
	public static void main(String[] args) {
		
//		Inner inner = new Inner(50);
		/*
		 * No enclosing instance of type Outter is accessible. 
		 * Must qualify the allocation with an enclosing instance of type Outter (e.g. x.new A() where x is an instance of Outter).
		 * Inner 클래스는 Outer 클래스가 생성이 되어야 생성할 수 있다.
		 * 
		*/
		
		Outer outer1 = new Outer(10);
		Outer outer2 = new Outer(20);
		
		Inner inner1 = outer1.new Inner(100);
		
		outer1.printOutter();
		inner1.printInner();
		
		Inner inner2 = outer1.new Inner(200);
		inner2.printInner();
		
		Inner inner3 = outer2.new Inner(300);
		Inner inner4 = outer2.new Inner(400);
		inner3.printInner();
		inner4.printInner();
		
		OuterStaticInnerClass osc = new OuterStaticInnerClass(300);
		InnerStaticClass isc = new InnerStaticClass(50);
		System.out.println(isc.sum());
		
		Outer outer3 = new Outer(30);
		Inner inner5 = outer3.new Inner(5000);
		inner5.printInner();
		
		OuterStaticInnerClass osc1 = new OuterStaticInnerClass(500);
		InnerStaticClass isc1 = new InnerStaticClass(200);
		System.out.println(isc1.sum()); // n(100)+isc1(200)
		
		
	} // main

} // class OutrerMain
