package BaekJoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] split = line.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int reward = 0;

        if (a == b && b == c) {
            reward = 10000 + 1000 * a;
        } else if (a == b) {
            reward = 1000 + 100 * a;
        } else if (c == b) {
            reward = 1000 + 100 * b;
        } else if (a == c) {
            reward = 1000 + 100 * a;
        } else {
            reward = 100 * Math.max(a, Math.max(b, c));
        }
        System.out.println(reward);
    }
}
