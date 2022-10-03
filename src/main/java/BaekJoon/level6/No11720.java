package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = s.toCharArray();

        int result = 0;
        for (char c : arr) {
            result += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);
    }
}
