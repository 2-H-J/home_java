package e02_priority;

import java.util.ArrayList;

public class PriorityMain {

    public static void main(String[] args) {
        // ThreadPriority 객체를 담을 ArrayList 생성
        ArrayList<ThreadPriority> list = new ArrayList<ThreadPriority>();

        // 10개의 ThreadPriority 객체 생성 및 리스트에 추가
        for(int i = 0; i < 10; i++) {
            // "스레드 i"라는 이름을 가진 ThreadPriority 객체 생성
            ThreadPriority t = new ThreadPriority("스레드" + i);
            
            // 생성된 스레드의 우선순위를 가장 낮은 값인 Thread.MIN_PRIORITY로 설정 (값: 1)
            t.setPriority(Thread.MIN_PRIORITY); 
            
            // 리스트에 해당 스레드 객체 추가
            list.add(t);
        }

        // 우선순위는 1부터 10까지 설정 가능, 1은 제일 낮음, 10은 제일 높음
        // 리스트의 마지막 스레드 (스레드9)의 우선순위를 최대값으로 설정 (Thread.MAX_PRIORITY: 10)
        list.get(list.size() - 1).setPriority(Thread.MAX_PRIORITY); 

        // 리스트에 있는 모든 스레드를 시작 (start() 호출)
        list.forEach(t -> t.start());
    }

}
