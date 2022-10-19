package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int itemSum = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < itemSum; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");


            result += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }

        if (totalPrice == result) System.out.println("Yes");
        else System.out.println("No");
    }
}
