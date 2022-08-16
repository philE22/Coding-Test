package DailyCoding;

public class No23_fibonacci {
    public static void main(String[] args) {
        No23_fibonacci test = new No23_fibonacci();
        int[] memo = new int[100];      //메모리제이션을 이용하여 시간복잡도를 O(N)으로 줄임
        System.out.println(test.fibo(9, memo));

    }

    public int fibo(int num, int[] memo) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        if (memo[num] == 0) {       //배열에 저장하여 다시 사용
            memo[num] = fibo(num - 1, memo) + fibo(num - 2, memo);
        }
        return memo[num];
    }
}
