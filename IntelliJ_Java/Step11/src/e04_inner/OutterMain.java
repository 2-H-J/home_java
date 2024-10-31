package e04_inner;

public class OutterMain {
    public static void main(String[] args) {

//        Outter.Inner inner = new Outter.Inner(); 중첩클래스는 겉에 있는 Outter클래스를 먼저 생성해줘야 Inner클래스도 생성할 수 있다.
        Outter outter1 = new Outter(40);

        Outter.Inner inner1 = outter1.new Inner(4); // Inner클래스를 생성할 때 먼저 선언해준 Outter 객체를 연결해줘야 한다
        inner1.printInner();// 40안에 있는 4 ( outter(40) -> inner(4))

        Outter.Inner inner2 = outter1.new Inner(200);
        inner2.printInner();
        // Outter변수중 int 접근제어자 private로 선언하면 보통 사용 못하는데 Inner클래스도 Outter클래스 안에 소속되어 있어 사용 가능하다.
        // 즉, 중요한 데이터접근을 중첩클래스로 사용이 가능하다.


        Outter outter2 = new Outter(50);

        Outter.Inner inner3 = outter2.new Inner(300);
        Outter.Inner inner4 = outter2.new Inner(400);
        inner3.printInner();
        inner4.printInner();

        //---------------------------------------------------------------------------------------------
        OutterStaticInnerClass osc = new OutterStaticInnerClass(300);
        OutterStaticInnerClass.InnerStaticClass isc = new OutterStaticInnerClass.InnerStaticClass(50);
        System.out.println(isc.sum());
    }
}
