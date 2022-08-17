package BaekJoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2_5_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] split = input.split(" ");
        int hr = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[1]);

        if (min >= 45) {
            min = min - 45;
        } else {
            min = min - 45 + 60;
            if (hr == 0) hr = 23;
            else hr = hr - 1;
        }
        System.out.println(hr + " " + min);
    }
}
