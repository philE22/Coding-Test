package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int[] result = new int[26];
        for (int i = 0; i < chars.length; i++) {
            int index = (int) chars[i] - 97;
            if (result[index] == 0) result[index] = i+1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) System.out.print(-1);
            else System.out.print(result[i] -1);
            if (i != result.length -1) System.out.print(" ");
        }
    }
}
