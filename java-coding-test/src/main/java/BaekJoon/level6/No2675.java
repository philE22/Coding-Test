package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String[] arr = br.readLine().split(" ");
            int repeat = Integer.parseInt(arr[0]);
            String str = arr[1];
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                sb.append(String.valueOf(c).repeat(repeat));
            }
            System.out.println(sb);
        }
    }
}
