package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10250 { //test
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());
        String[] str = new String[times];
        for (int i = 0; i < times; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < times; i++) {
            String[] arr = str[i].split(" ");
            int floor = Integer.parseInt(arr[0]);
            int client = Integer.parseInt(arr[2]);

            int head = client % floor;

            int tail = client / floor + 1;
            if (head == 0) {
                head = floor;
                tail--;
            }
            System.out.println(head * 100 + tail);
        }

    }
}
