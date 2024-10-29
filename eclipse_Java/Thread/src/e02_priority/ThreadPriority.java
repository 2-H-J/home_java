package e02_priority;

// ThreadPriority 클래스는 자바의 Thread 클래스를 상속받아 사용
// 우선순위를 가진 스레드를 생성하고 실행하는 예제
public class ThreadPriority extends Thread {

    // 생성자: 스레드의 이름을 받아서 초기화하는 생성자
    // super(name)을 사용하여 부모 클래스인 Thread 클래스의 생성자를 호출
    public ThreadPriority(String name) {
        super(name); // Thread 클래스의 생성자를 호출하여 스레드 이름을 설정
    }

    // run() 메서드는 스레드가 실행될 때 수행할 작업을 정의
    @Override
    public void run() {
        // 반복문을 사용하여 10번 반복 실행
        for (int i = 0; i < 10; i++) {
            try {
                // Thread.sleep(1000): 1초 동안 스레드를 멈추게 함 (1000 밀리초)
                // 스레드가 실행될 때마다 1초씩 대기 후 다시 작업을 진행
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // sleep 중 인터럽트(중단)가 발생하면 예외를 처리
                e.printStackTrace();
            }
        }
        
        // 스레드 실행이 끝나면 스레드의 이름과 우선순위를 출력
        // getName()은 스레드 이름을 반환하고, getPriority()는 스레드 우선순위를 반환
        System.out.println(getName() + " 스레드 종료 - 우선순위: " + getPriority());
    }
    
}
