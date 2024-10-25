public class E01_if {
    /*
            if 문
                조건식 true면 if문에 붙어 있는 {  실행 영역 }에 있는 코드를 실행
                조건식이 false면 해당 if문을 건너뜀
                
            조건식 : 관계연산자와 논리 연산자를 이용한 수식, 결과는 true/false로 나옴
            
            
            if(조건식){
                실행 코드...
                실행 코드...
                실행 코드...
            }
            
            if문의 구성요소는 if, else if, else 가 있음
    */
    public static void main(String[] args) {
        int n = 10;
        
        if(n < 0){
            System.out.println("음수 입니다.");
        }
        if(n > 0){
            System.out.println("양수 입니다.");
        }
        if(n == 0){
            System.out.println("0 입니다.");
        }
        System.out.println("프로그램 종료");

    }
}
