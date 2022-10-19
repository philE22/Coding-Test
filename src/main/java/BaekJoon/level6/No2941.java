package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int count = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '=' && i > 0) {
                if (arr[i - 1] == 'c' || arr[i - 1] == 's') {
                    count--;
                }
                if (arr[i - 1] == 'z') {
                    if (i > 1 && arr[i - 2] == 'd') {
                        count -= 2;
                    } else count--;
                }
            }
            if (i > 0 && arr[i] == '-') {
                if (arr[i - 1] == 'c' || arr[i - 1] == 'd') count--;
            }
            if (i > 0 && arr[i] == 'j') {
                if (arr[i - 1] == 'n' || arr[i - 1] == 'l') count--;
            }
        }

        System.out.println(count);
    }
}
