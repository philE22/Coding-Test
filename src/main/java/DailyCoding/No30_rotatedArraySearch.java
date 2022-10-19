package DailyCoding;

public class No30_rotatedArraySearch {
    public static void main(String[] args) {
        int[] rotated = new int[]{4, 5, 6, 0, 1, 2, 3};
//        int[] rotated = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int target = 100;

        No30_rotatedArraySearch test = new No30_rotatedArraySearch();
        System.out.println(test.rotatedArraySearch(rotated, target));
    }

    public int rotatedArraySearch(int[] rotated, int target) {
        //첫번째 인자를 확인
        //첫번째 인자보다 크면 절반에서 왼쪽가운데 탐색
        // 작으면 절반에서 오른쪽 가운데 탐색
        // 이후로는 이진탐색
        int length = rotated.length -1;
        int index = rotated.length / 2;


        if (rotated[0] < target) {
            length = index;
            index = index / 2;
        } else if (rotated[0] > target) {
            index = (index + length) / 2;
        } else return 0;

        for (int i = 0; i < rotated.length / 2 + 1; i++) {
            if (rotated[index] > target) {
                length = index;
                index = index / 2;
            } else if (rotated[index] < target) {
                index = (index + length)/2;
            } else return index;
        }
        return -1;
    }
}
