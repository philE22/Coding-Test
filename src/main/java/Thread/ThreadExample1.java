package Thread;

public class ThreadExample1 {
    public static void main(String[] args) {
//        Runnable task1 = new ThreadTask1();

        Thread thread1 = new Thread(new Runnable() { //익명 객체로 생성 및 실행 가능
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("#");
                }
            }
        });

//        한 줄로 축약 가능
//        Thread thread1 = new Thread(task1);

        thread1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("@");
        }
    }
}

//class ThreadTask1 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("#");
//        }
//    }
//}
