package Thread;

public class ThreadExample5 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "this!!");
            }
        });

        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
