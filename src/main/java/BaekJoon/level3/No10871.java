package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] inputArr = str.split(" ");
        int times = Integer.parseInt(inputArr[0]);
        int baseNum = Integer.parseInt(inputArr[1]);

        String arrStr = br.readLine();
        String[] arr = arrStr.split(" ");
        String result = "";

        for (int i = 0; i < times; i++) {
            int Num = Integer.parseInt(arr[i]);

            if (baseNum > Num) {
                result = result + Num;

                if (i < times - 1) result = result + " ";
            }

        }

        System.out.println(result);
    }
}
