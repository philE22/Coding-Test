package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class No29_tiling {
    public static void main(String[] args) {
        // 2 * 5 타일 채우기
        //  @ @ @ @ @
        //  @ @ @ @ @
        //  1 2 3 5
        //       +2
        No29_tiling test = new No29_tiling();

        int num = 43;
        ArrayList<Integer> memo = new ArrayList<>(Arrays.asList(0, 1, 2));
        System.out.println(test.aux(num, memo) + "!!!");
        System.out.println(test.tiling(num));
    }

    public int tiling(int num) {
        // TODO:
        if (num == 1) return 1;
        if (num == 2) return 2;


        return tiling(num - 2) + tiling(num - 1);
    }


    public int aux(int size, ArrayList<Integer> memo) {
        if(memo.size() > size) return memo.get(size);

        memo.add(aux(size - 1, memo) + aux(size - 2, memo));
        return memo.get(size);
    };
}


