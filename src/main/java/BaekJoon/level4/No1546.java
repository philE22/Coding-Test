package BaekJoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        double max = 0;
        double[] doubles = new double[times];

        for (int i = 0; i < times; i++) {
            double num = Double.parseDouble(arr[i]);
            doubles[i] = num;
            if (num > max) max = num;
        }

        double sum = Arrays.stream(doubles).sum();
        System.out.println(sum/max*100/times);
    }
}
