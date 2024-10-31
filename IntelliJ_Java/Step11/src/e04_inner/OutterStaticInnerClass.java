package e04_inner;

//Static 미리 메모리 할당
/*
    static 키워드는 클래스의 특정 멤버(변수나 메서드)를 객체가 아닌 클래스 자체에 속하게 만든다
*/

public class OutterStaticInnerClass {
    private int outter;
    private static int n = 100;

    public OutterStaticInnerClass(int outter) {
        this.outter = outter;
    }

//---------------------------------------------------------
    public static class InnerStaticClass{
        private int inner;

        public InnerStaticClass(int inner) {
            this.inner = inner;
        }

        public int sum(){
        // 현재 InnerClass가 static이기 때문에 누구의 outter 필드인지 모름
            // static은 none static에 접근할 수 없다.
            // return outter + inner;
            return n+inner;
        }

    }//InnerClass

}//OutterClass
