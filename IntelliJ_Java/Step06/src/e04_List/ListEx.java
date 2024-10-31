package e04_List;

import java.util.ArrayList;

public class ListEx {
    /*

    */
    public static void main(String[] args) {

        // 리스트 생성 ArrayList<레퍼런스타입 데이터>
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> strings;
        ArrayList<Double>  doubles;

        // 데이터 추가
        list.add(29);
        list.add(20);
        list.add(32);
        list.add(52);
        list.add(12);
        System.out.println(list); // 전체 출력
        System.out.println(list.toString()); // 전체 출력
        System.out.println("------------------------------");

        // 저장된 데이터 개수
        System.out.println(list.size()); // .size() 저장된 갯수

        System.out.println("------------------------------");
        // 데이터 전체 조회
        System.out.println(list.get(0)); // .get(인덱스번호) 원하는 인덱스 데이터 값 출력\

        for(int i = 0; i < list.size(); i++){ // for문 인덱스로 모든값 출력
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
        // 데이터 삭제
        list.remove(3); // 인덱스 값을 지정해서 그 인덱스 값 삭제
        System.out.println(list);
        list.remove("20");
        System.out.println(list);

    }
}
