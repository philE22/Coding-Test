package BaekJoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String string = br.readLine();
            String[] arr = string.split(" ");
            int t = Integer.parseInt(arr[0]);
            int avgOver = 0;
            int sum = 0;

            for (int j = 1; j <= t; j++) {
                sum += Integer.parseInt(arr[j]);
            }
            double avg = sum / (double)t;

            for (int j = 1; j <= t; j++) {
                if (Double.parseDouble(arr[j]) > avg) avgOver++;
            }

            System.out.printf("%.3f%s%n", (avgOver/(double)t) * 100, "%");
        }
    }
}
