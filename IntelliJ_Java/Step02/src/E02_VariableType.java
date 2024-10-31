public class E02_VariableType {
    public static void main(String[] args) {

        /*
         변수명 짓는 규칙
            1. 알파벳(대소문자 구분), 숫자, 특수문자 - > _ $
            2. 키워드와 동일하면 안됨
            3. 첫 글자로 숫자가 올 수 없음
            4. 중복된 변수명을 쓸 수 없음

         변수명 네이밍 규칙
            Camel Case(카멜 표기법) : 변수명, 메서드명
                -> 첫글자는 소문자로 시작
                -> 합성어 일때 두번째 단어부터 첫글자는 대문자

            Snake Case(스네이크 표기법) : 상수명
                -> 단어와 단어 사이를 _ 로 구분
                -> 이름이 전부 소문자 이거나 대문자 일 때 사용

            Pascal Case(파스칼 표기법) : 클래스명, 인터페이스명
                -> 첫글자는 대문자로 시작 -> ex) public class VariableType
                -> 합성어 일때 두번째 단어부터 첫글자는 대문자
      */

        // 실수

//      float f = 3.1415;  //실수 float는 그냥 선언하면 에러 발생 실수 뒤 F를 붙여 float를 선언한다
        float f = 3.1415F;
        System.out.println(f);

        double d = 3.1415;
        System.out.println(d);

        // 문자 한글자
        char c1 = 'A';
        System.out.println(c1);

        String str = "으에에에에";
        System.out.println(str);

        int i1 = c1;
        System.out.println(i1);



    }
}
