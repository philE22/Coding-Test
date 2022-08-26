package DailyCoding;

import java.util.ArrayList;

public class No29_tiling {
    public static void main(String[] args) {
        // 2 * 5 타일 채우기
        //  @ @ @ @ @
        //  @ @ @ @ @
        //  1 2 3 5
        //       +2
        No29_tiling test = new No29_tiling();
        list = new int[100];
        System.out.println(test.fibo(4));
    }

    static int[] list;
    public static int fibo(int num) {
        // TODO:
        if (num <= 2) return num;

        if (list[num]  != 0) return list[num];

        return list[num] = fibo(num - 2) + fibo(num - 1);
    }
}


