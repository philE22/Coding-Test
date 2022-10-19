package BaekJoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = 0;
        String str = br.readLine();
        String[] arr = str.split(" ");


        for (String a : arr) {

            int num = Integer.parseInt(a);

            if (num > max) max = num;

            if (num < min) min = num;
        }

        System.out.println(min + " " + max);
    }
}
