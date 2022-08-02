package Section1.Thread;

public class ThreadExample4 {
    public static void main(String[] args) {

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Set And Get Section1AndAlgorithm.Thread Name");
            }
        });

        thread4.start();

        System.out.println("thread4.getName() = " + thread4.getName());

        thread4.setName("Code States");

        System.out.println("thread4.getName() = " + thread4.getName());
    }
}
