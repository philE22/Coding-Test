package BaekJoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int cookingTime = Integer.parseInt(br.readLine());

        String[] split = s.split(" ");
        int hr = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[1]);

        min = min + cookingTime;

        while (min >= 60) {
            min -= 60;
            hr += 1;
            if (hr >= 24) hr = 0;
        }

        System.out.println(hr + " " + min);

    }
}
