package e04_inner;

// 중첩클래스 클래스 안에 클래스 추가

//--------------------Outter Class
public class Outter {

        private int outter;

    public Outter(int outter) {
        this.outter = outter;
    }

    public void printOutter(){
        System.out.println("outter : "+outter);
    }


    //------------------Inner Class
    public class Inner{

        private int inner;

        public Inner(int inner) {
            this.inner = inner;
        }

        public int sum(){
            return outter + inner;
        }

        public void printInner(){
            System.out.println(outter+" -> "+inner);
        }
    }//--------------InnerClass끝
}//----------------OutterClass끝
