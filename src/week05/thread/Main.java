package week05.thread;

public class Main {
    public static void main(String[] args) {
        // 클래스 자체 상속
//        TestThread thread = new TestThread();
//        thread.start();

        // Runnable 사용
//        Runnable runnable = new TestRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();

        // 람다 사용
        Runnable task = () -> {
            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum += 1;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + "최종 합 : " + sum) ;
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
