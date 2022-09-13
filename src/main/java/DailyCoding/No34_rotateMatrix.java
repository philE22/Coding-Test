package DailyCoding;

import java.util.Arrays;

public class No34_rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 2;

        No34_rotateMatrix test = new No34_rotateMatrix();
        System.out.println(Arrays.deepToString(test.rotateMatrix(matrix, 1)));

    }

    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        // x축이 y축이 됨
        // int[0][i] 은 int[i][n-1]이됨
        // int[1][i] 는 int[i][n-2]
        if(matrix == null) return null;

        int N = matrix.length;
        int[][] rotatedMatrix = new int[N][N];


        while(K != 0){

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    rotatedMatrix[j][N - 1 - i] = matrix[i][j];
                }
            }

            for (int i = 0; i < N; i++) {
                matrix[i] = Arrays.copyOf(rotatedMatrix[i], N);
            }

            K -= 1;
        }
        return rotatedMatrix;
    }
}
