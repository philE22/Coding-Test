package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int count;
            int[] ints = new int[b];
            for (int k = 0; k < b; k++) {
                ints[k] = k + 1;
            }

            for (int j = 0; j < a; j++) {
                int[] newInts = new int[b];
                for (int k = 0; k < b; k++) {
                    int sum = 0;

                    for (int l = 0; l <= k; l++) {
                        sum += ints[l];
                    }

                    newInts[k] = sum;
                }

                ints = newInts;
            }
            System.out.println(ints[b - 1]);
        }
    }
}
