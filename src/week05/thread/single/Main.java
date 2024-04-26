package week05.thread.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };


        Thread thread1 = new Thread(task);
        thread1.setName("thread1");

        thread1.start();
    }
}
