package Kakao.level1;

import java.util.Arrays;

public class No3 {
    public static void main(String[] args) {
        No3 test = new No3();
        int N = 5;
        int[] stages = {1,1,1,1,1,1,1,1};
        int[] solution = test.solution(N, stages);
        System.out.println(Arrays.toString(solution));

    }

    public int[] solution(int N, int[] stages) {
        //스테이지별 도달한 플레이어 수와 아직 클리어하지 못한 플레이어수를 집계
        int[] numberOfChallenger = new int[N + 2];
        int[] numberOfChallenging = new int[N + 2];

        for (int i = 0; i < stages.length; i++) {
            int stageNum = stages[i];
            numberOfChallenging[stageNum]++;    //해당 스테이지에서 클리어 못한 플레이어 집계

            for (int j = 1; j <= stageNum; j++) {
                numberOfChallenger[j]++;        //도달한 총 플레이어 집계
            }
        }

        // 스테이지별 실패율 계산
        double[] fail = new double[N + 1]; //6
        for (int i = 1; i <= N; i++) {
            double v;
            //아예 도달 못한 스테이지가 있으면 분모가 0이 되므로 처리해줘야함
            if (numberOfChallenger[i] != 0) v = (double) numberOfChallenging[i] / numberOfChallenger[i];
            else v= 0;
            fail[i] = v;
        }


        int[] answer = new int[N];
        boolean[] checked = new boolean[N + 2];

        //실패율이 높은 순으로 정렬
        for (int i = 0; i < N; i++) {
            int minNum = 0;
            double minValue = -1;

            for (int k = 1; k < fail.length; k++) {
                if (!checked[k]) {
                    if (minValue < fail[k]) {
                        minNum = k;
                        minValue = fail[k];
                    }
                }
            }
            answer[i] = minNum;
            checked[minNum] = true;
        }


        return answer;
    }
}
