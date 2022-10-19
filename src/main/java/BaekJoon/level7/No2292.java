package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) - 1;
        int result = 1;
        int minus = 0;
        int six = 6;

        while (num > 0) {
            minus += six;
            num -= minus;
            result++;
        }

        System.out.println(result);
    }
}
