package BaekJoon.level3;

import java.io.*;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(br.readLine());

        for (int i = 0; i < times; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
