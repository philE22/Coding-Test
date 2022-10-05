package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");

        int count = 0;

        for (String s : arr) {
            if (!s.equals("")) count++;
        }

        System.out.println(count);
    }
}
