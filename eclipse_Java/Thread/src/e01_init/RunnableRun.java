package e01_init;

// RunnableRun 클래스는 Runnable 인터페이스를 구현하여 멀티쓰레드 환경에서 사용될 수 있도록 설계됨
public class RunnableRun implements Runnable {

    // 쓰레드의 이름을 저장할 변수
    private String name;
    
    // 생성자: 객체 생성 시 쓰레드의 이름을 전달받아 초기화
    public RunnableRun(String name) {
        super(); // 부모 클래스 생성자 호출 (Object 클래스)
        this.name = name; // 전달받은 name 값을 해당 객체의 name 필드에 저장
    }

    // Runnable 인터페이스의 run() 메서드를 구현
    // run() 메서드는 쓰레드가 실행될 때 수행될 작업을 정의
    @Override
    public void run() {
        // 단순히 반복문을 통해 10억 번을 루프 (실제로는 시간을 소비하는 작업을 할 수 있음)
        // 이 반복문은 10억 번의 루프가 끝날 때까지 아무 동작도 하지 않음
        for (int i = 0; i < 1_000_000_000; i++);
        
        // 루프가 끝나면 해당 쓰레드의 이름과 현재 시간을 출력
        // 이 메시지는 루프가 끝난 후에 쓰레드의 종료를 알리는 메시지로 사용됨
        System.out.println(name + " - 종료 - " + System.currentTimeMillis());
    }
}
