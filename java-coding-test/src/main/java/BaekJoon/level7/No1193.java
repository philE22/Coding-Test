package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 1;
        boolean check = false;

        for (int i = 1; i < num; i++) {
            if (a == 1 && !check) {
                b++;
                check = true;
                continue;
            }
            if (b == 1 && check) {
                a++;
                check = false;
                continue;
            }

            if (check) {
                a++;
                b--;
            }

            if (!check) {
                b++;
                a--;
            }
        }

        System.out.println(a + "/" + b);

    }
}
