package BaekJoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tiems = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= tiems; i++) {
            String str = String.valueOf(i);
            char[] arr = str.toCharArray();

            if (arr.length == 1 || arr.length == 2) {
                count++;
                continue;
            }

            int box = -1;
            int diff = Integer.parseInt(String.valueOf(arr[1])) - Integer.parseInt(String.valueOf(arr[0]));
            boolean check = true;

            for (int k = 1; k < arr.length; k++) {
                if (k == 1) {
                    box = Integer.parseInt(String.valueOf(arr[k]));
                    continue;
                }
                if (box + diff != Integer.parseInt(String.valueOf(arr[k]))) {
                    check = false;
                    break;
                }
            }
            if (check == true) count++;
        }
        System.out.println(count);
    }
}
