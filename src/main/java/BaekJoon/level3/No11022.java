package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int first = Integer.parseInt(arr[0]);
            int second = Integer.parseInt(arr[1]);
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, first, second, first + second);
        }
    }
}
