package BaekJoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10250 {
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
            int room = Integer.parseInt(arr[1]);
            int client = Integer.parseInt(arr[2]);

            int head = client % floor;
            int tail = (int) (client / floor) + 1;
            if (client <= floor) head = client;
            if (client == floor) tail = 1;
            System.out.println(head * 100 + tail);
        }
    }
}
