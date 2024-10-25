public class E03_else {
    /*
        else

            else 이전의 모든 조건문들이 거짓일때 실행되는 영역
            else는 마지막 조건문에 해당하기 때문에 조건식이 없고,
            맨 마지막에 작성됨

            if가 생략된 상태로는 사용이 불가능하다.
    */
    public static void main(String[] args) {
        int n = 11;

        if(n % 3 == 0){
            System.out.println("3의 배수 입니다.");
        }else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
