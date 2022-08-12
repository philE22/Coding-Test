package DailyCoding;

import java.util.Arrays;

public class No22 { // Bubble Sort
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3};
        while (true) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int first = arr[i];
                int last = arr[i + 1];
                if (last < first) {
                    arr[i] = last;
                    arr[i + 1] = first;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
