package e01_init;

import java.util.ArrayList;

public class RunnableMain {

    public static void main(String[] args) {
        // 아래의 세 줄은 각기 다른 이름을 가진 세 개의 쓰레드를 생성하는 코드입니다.
        // 각각 "스레드 1", "스레드 2", "스레드 3"이라는 이름을 가진 쓰레드가 생성되고 실행됩니다.
        // Thread t1 = new Thread(new RunnableRun("스레드 1"));
        // Thread t2 = new Thread(new RunnableRun("스레드 2"));
        // Thread t3 = new Thread(new RunnableRun("스레드 3"));
        // t1.start(); // t1 쓰레드를 실행
        // t2.start(); // t2 쓰레드를 실행
        // t3.start(); // t3 쓰레드를 실행

        // ArrayList를 사용하여 여러 쓰레드를 관리하기 위한 리스트를 생성합니다.
        ArrayList<Thread> list = new ArrayList<>();

        // for문을 사용하여 10개의 쓰레드를 생성하고 리스트에 추가합니다.
        // i 값을 사용하여 "스레드 - i" 라는 이름을 가진 쓰레드를 생성합니다.
        for(int i = 0; i < 10; i++) {
            // 새 Thread 객체를 생성하여 RunnableRun 객체를 생성자에 전달합니다.
            // RunnableRun 객체는 "스레드 - i" 라는 이름을 가지고 실행될 때 출력에 사용됩니다.
            list.add(new Thread(new RunnableRun("스레드 - " + i)));
        }

        // 리스트에 있는 모든 쓰레드를 실행합니다.
        // forEach를 사용하여 각 쓰레드를 반복하면서 start() 메서드를 호출하여 쓰레드를 실행합니다.
        list.forEach(t -> t.start());
    }
}
