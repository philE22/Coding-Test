package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < times; i++) {
            char[] arr = br.readLine().toCharArray();
            HashSet<Character> set = new HashSet<>();
            boolean check = true;
            char box = ' ';

            for (int j = 0; j < arr.length; j++) {
                if(set.contains(arr[j])) check = false;

                if (j == 0) {
                    box = arr[j];
                    continue;
                }

                if (box != arr[j]) {
                    set.add(box);
                    box = arr[j];
                }

            }

            if (check) count++;
        }

        System.out.println(count);
    }
}
