package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        String s1 = arr[0];
        StringBuffer sb1 = new StringBuffer(s1);
        String str1 = sb1.reverse().toString();
        int i1 = Integer.parseInt(str1);

        String s2 = arr[1];
        StringBuffer sb2 = new StringBuffer(s2);
        String str2 = sb2.reverse().toString();
        int i2 = Integer.parseInt(str2);

        if (i1 > i2) System.out.println(i1);
        else System.out.println(i2);
    }
}
