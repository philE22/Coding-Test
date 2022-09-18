package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int box = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > box) {
                box = num;
                index = i + 1;
            }
        }

        System.out.println(box);
        System.out.println(index);
    }
}
