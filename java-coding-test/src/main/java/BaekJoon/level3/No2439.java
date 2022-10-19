package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        String str = "*";
        String blank = " ";

        for (int i = 1; i <= times; i++) {
            System.out.println(blank.repeat(times - i) + str.repeat(i));
        }
    }
}

