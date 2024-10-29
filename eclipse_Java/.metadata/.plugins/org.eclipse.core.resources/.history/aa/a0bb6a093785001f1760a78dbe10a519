package e05_job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;
	
	private JobInfo() {}

	public static JobInfo getInstance() {
		if(instance == null)
			instance = new JobInfo();
		return instance;
	}
	
	public synchronized void writeJob(String job) {
		jobInfo = job;//구직 정보 저장
		notifyAll();//현재 대기중인 모든 스레드를 깨움
	}

	public synchronized String getJobInfo() throws InterruptedException {
		String msg = null;
		if(jobInfo == null){//null이면 구직 정보가 없어서 스레드를 대기 상태로 만듬
			wait();
		}
		msg = jobInfo;
		jobInfo = null;
		return msg;
	}
}
