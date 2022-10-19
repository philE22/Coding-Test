package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");

            System.out.printf("Case #%d: %d%n", i+1, Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}
