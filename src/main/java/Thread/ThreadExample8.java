package Thread;

public class ThreadExample8 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.setTo(10);

        sumThread.start();

        try {
            sumThread.join();
        } catch (Exception e) {}

        System.out.printf("1부터 %d까지의 합 : %d", sumThread.getTo(), sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    private  int to;

    public long getSum() {
        return sum;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void run() {
        for (int i = 0; i <= to; i++) {
            sum += i;
        }
    }
}
