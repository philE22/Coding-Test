package DailyCoding;

import java.util.Arrays;

public class No34_rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int K = 2;

        No34_rotateMatrix test = new No34_rotateMatrix();
        System.out.println(Arrays.deepToString(test.rotateMatrix(matrix, 2)));

    }

    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        // x축이 y축이 됨
        // int[0][i] 은 int[i][n-1]이됨
        // int[1][i] 는 int[i][n-2]
        if(matrix == null) return null;

        int N = matrix.length;  //2
        int M = matrix[0].length;  //4
        int[][] rotatedMatrix = new int[M][N];
        int[][] sameMatrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            sameMatrix[i] = Arrays.copyOf(matrix[i], M);
        }


        while(K != 0){

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    rotatedMatrix[j][N - 1 - i] = sameMatrix[i][j];
                }
            }
            K -= 1;

            if (K == 0) return rotatedMatrix;

            if (K != 0) {
                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                        sameMatrix[j][M - 1 - i] = rotatedMatrix[i][j];
                    }
                }
                K -= 1;
                if (K == 0) return sameMatrix;
            }
        }

        return null;
    }
}
