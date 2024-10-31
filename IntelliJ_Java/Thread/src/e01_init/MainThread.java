package e01_init;

public class MainThread {
    public static void main(String[] args) {
        ThreadA th = new ThreadA();
        Thread th2 = new Thread(new ThreadB());
        th.start(); // 새로운 스레드로 시작
        th2.start();

        for(int i = 0; i < 1000; i++){ // 메인이 실행하는 Thread 
            System.out.println("main : "+i);
        }
    }
}
