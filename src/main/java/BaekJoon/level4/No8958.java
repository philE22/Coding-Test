package BaekJoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String str = br.readLine();
            char[] array = str.toCharArray();
            int sum = 0;
            int box = 0;
            for (int j = 0; j < array.length; j++) {
                char c = array[j];
                if (c == 'O') {
                    box++;
                    sum += box;
                }
                if (c == 'X') {
                    box = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
