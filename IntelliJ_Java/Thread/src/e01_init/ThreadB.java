package e01_init;

class A{}
public class ThreadB extends A implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("ThreadB : "+i);
        }
    }
}
