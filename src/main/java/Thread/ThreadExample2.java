package Thread;

public class ThreadExample2 {
    public static void main(String[] args) {
//        Thread thread2 = new ThreadTask2();

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("#");
                }
            }
        };
        thread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("@");
        }
    }
}

//class ThreadTask2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("#");
//        }
//    }
//}
