package e05_job;

public class JobInfo {
    
    // JobInfo 클래스의 유일한 인스턴스 (싱글톤 패턴)
    private static JobInfo instance = new JobInfo();
    
    // 구직 정보를 저장하는 변수
    private String jobInfo;
    
    // 생성자를 private으로 선언하여 외부에서 객체를 생성하지 못하도록 함 (싱글톤 패턴)
    private JobInfo() {}

    // JobInfo의 인스턴스를 반환하는 메서드 (싱글톤 패턴 적용)
    public static JobInfo getInstance() {
        // instance가 null일 경우 새로운 JobInfo 객체를 생성 (사실상 이 코드는 불필요)
        if(instance == null)
            instance = new JobInfo();
        return instance;
    }
    
    // 구직 정보를 저장하는 메서드
    // 메서드가 synchronized로 선언되어 여러 스레드에서 동시에 접근하지 못하도록 함
    public synchronized void writeJob(String job) {
        jobInfo = job; // 전달받은 구직 정보를 저장
        notifyAll(); // 대기 중인 모든 스레드를 깨워서 작업을 처리하게 함
    }

    // 구직 정보를 가져오는 메서드
    // synchronized로 선언하여 여러 스레드에서 동시에 접근하지 못하게 함
    public synchronized String getJobInfo() throws InterruptedException {
        String msg = null;
        
        // jobInfo가 null이면 구직 정보가 없으므로 스레드를 대기 상태로 만듬
        if(jobInfo == null) {
            wait(); // 스레드가 구직 정보가 입력될 때까지 대기
        }
        
        // 대기에서 깨어나면 구직 정보를 msg에 저장
        msg = jobInfo;
        jobInfo = null; // 구직 정보를 가져간 후, null로 초기화
        
        // 구직 정보를 반환
        return msg;
    }
}
