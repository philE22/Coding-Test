package BaekJoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class No1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = 0;
        String str = br.readLine();
        int result = 0;
        int baseNum = Integer.parseInt(str);

//        if (baseNum == 0) {
//            System.out.println(1);
//        }

        while (result != baseNum){

            String[] arr = str.split("");

            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[arr.length - 1]);

            String[] arr1 = String.valueOf(sum).split("");

            str = arr[arr.length - 1] + arr1[arr1.length -1];
            if (str.equals("00")) result = 0;
            else result = Integer.parseInt(str);

            cycle++;
        }

        if (cycle == 0) System.out.println(1);
        else System.out.println(cycle);
    }
}
