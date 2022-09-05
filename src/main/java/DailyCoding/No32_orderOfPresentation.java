package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class No32_orderOfPresentation {
    public static void main(String[] args) {
        int N = 3;
        int[] K = new int[]{2, 3, 1};
        int[] arr = new int[N];
        boolean[] check = new boolean[N + 1];

        ArrayList<int[]> ints = new ArrayList<>();

//        for (int i = 0; i < N; i++) {
//            arr[i] = i + 1;
//        }

        No32_orderOfPresentation test = new No32_orderOfPresentation();
        test.permu(0, arr, ints, check);

        ints.stream()
                .forEach(ints1 -> System.out.println(Arrays.toString(ints1)));

    }

    public int[] permu(int n, int[] arr, ArrayList<int[]> ints, boolean[] check) {
        // for문 돌면서 첫번째 인자에 넣는다
        // 사용했다고 체크한다
        // +1 로 재귀에 들어간다.

        if (n == arr.length) {
            ints.add(arr);
            return arr;
        }

        for (int i = 1; i <= arr.length; i++) {
            if (check[i] == false) {
                arr[n] = i;
                check[i] = true;
                permu(n + 1, arr, ints, check);
                check[i] = false;
            }
        }

        return arr;
    }
}
