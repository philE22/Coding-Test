package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class No21 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, -5, 7};

        int result = 0;

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int box = arr[i] * arr[j] * arr[k];
                    if(box > result) result = box;
                }
            }
        }


        System.out.println(result);

    }
}
