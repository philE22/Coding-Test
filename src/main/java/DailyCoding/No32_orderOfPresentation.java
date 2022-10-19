package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class No32_orderOfPresentation {
    public static void main(String[] args) {
        int N = 5;
        int[] K = new int[]{1,3,2,4,5};
        No32_orderOfPresentation test = new No32_orderOfPresentation();
        System.out.println(test.method(N, K));
    }

    public int method(int N, int[] K) {
        // 해당 숫자가 되기 전까지의 경우의 수를 구하면 몇 번째인지 알 수 있음
        // n개의 숫자를 배열하는 경우의 수 n!
        // 1. 첫번쨰 숫자를 확인한다
        // 2. 그 숫자보다 작은 수였을때의 경우의 수를 구한다.
        // 3. 다음 위치 숫자로 넘어가서 다시 실행
        int result = 0;
        boolean[] isUsed = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            // 1. n번째 숫자를 구함
            int num = K[i];
            isUsed[num] = true;

            boolean[] copyBooleans = Arrays.copyOfRange(isUsed, 1, num);
            int count = 0;
            for (boolean used : copyBooleans) {
                if (!used) {
                    count++;
                }
            }
            // 2. 그숫자 이전의 경우의 수를 구함
            result = result + factorial(K.length - i -1)*count;
        }

        return result;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

}
