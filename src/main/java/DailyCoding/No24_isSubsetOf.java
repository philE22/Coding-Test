package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class No24_isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean check = true;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < base.length; i++) {
            list.add(base[i]);
        }

        for (int i = 0; i < sample.length; i++) {
            int el = sample[i];
            if(!list.contains(el)) check = false;
        }


        System.out.println(check);
    }

}
