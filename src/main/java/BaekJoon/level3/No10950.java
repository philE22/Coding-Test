package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String line = br.readLine();
            String[] split = line.split(" ");
            int sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();
            System.out.println(sum);
        }
    }
}
