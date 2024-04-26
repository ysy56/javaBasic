package week05.thread;

public class TestThread extends Thread{
    @Override
    public void run() {
        // 실제 우리가 쓰레드에서 수행할 작업
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}
