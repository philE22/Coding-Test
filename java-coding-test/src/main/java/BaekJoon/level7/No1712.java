package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        long expense = Long.parseLong(arr[0]);
        long buy = 0L;
        long a = Long.parseLong(arr[1]);
        long price = Long.parseLong(arr[2]);

        if (a >= price) {
            System.out.println(-1);
            return;
        }

        while (true) {
            expense += a;
            buy += price;

            if (buy > expense) {
                System.out.println((int)(buy / price));
                break;
            }
        }
    }
}
