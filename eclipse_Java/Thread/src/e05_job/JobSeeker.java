package e05_job;

public class JobSeeker extends Thread {

    // JobSeeker 생성자: Thread 이름을 설정 (구직자의 이름)
    public JobSeeker(String name) {
        super(name);
    }

    // 스레드 실행 시 호출되는 메서드 (run 메서드 오버라이딩)
    @Override
    public void run() {
        // 무한 루프를 통해 계속해서 구직 정보를 수신하려고 시도
        while (true) {
            try {
                // 현재 스레드(구직자)가 구직 정보를 기다리고 있다는 메시지 출력
                System.out.println(getName() + "가 구직 정보 수신을 대기 중입니다.");
                
                // JobInfo 싱글톤 객체에서 구직 정보를 가져옴 (정보가 없으면 대기)
                String msg = JobInfo.getInstance().getJobInfo();
                
                // 구직 정보를 받으면 처리
                if (msg != null) {
                    // 구직 정보를 수신했다는 메시지 출력
                    System.out.println(msg + "는 " + getName() + "님이 수신하였습니다.");
                    
                    // 구직자 지원이 종료되었다는 메시지 출력 후 스레드 종료
                    System.out.println(getName() + "구직자 지원 종료");
                    return; // 스레드 종료
                }
            } catch (InterruptedException e) {
                // 대기 중 인터럽트가 발생할 경우 예외 메시지 출력
                e.printStackTrace();
            }
        }
    }
}
