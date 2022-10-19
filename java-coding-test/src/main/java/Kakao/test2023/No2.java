package Kakao.test2023;

import java.util.*;

public class No2 {
    public static void main(String[] args) {
        No2 test = new No2();
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        System.out.println(test.solution(cap, n, deliveries, pickups));
    }

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long result = 0;
        Stack<int[]> goStack = new Stack<>();

        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] != 0) {
                goStack.push(new int[]{i, deliveries[i]});
            }
        }

        Stack<int[]> backStack = new Stack<>();
        for (int i = 0; i < pickups.length; i++) {
            if (pickups[i] != 0) {
                backStack.push(new int[]{i, pickups[i]});
            }
        }

        while (!goStack.isEmpty() || !backStack.isEmpty()) { //모든 요구사항이 끝날때 까지
            int go = 0;
            int back = 0;
            int haveToGo = 0;
            //갈때

            while (go != cap) {
                if (goStack.isEmpty()) break;

                int[] goPop = goStack.pop();

                go += goPop[1];
                if (haveToGo == 0) haveToGo = goPop[0] + 1;

                if (go > cap) {
                    goPop[1] = go - cap;
                    goStack.push(goPop);
                    go = cap;
                }
            }

            while (back != cap) {
                if (backStack.isEmpty()) break;

                int[] backPop = backStack.pop();
                back += backPop[1];
                if (backPop[0] + 1> haveToGo) haveToGo = backPop[0] + 1;

                if (back > cap) {
                    backPop[1] = back - cap;
                    backStack.push(backPop);
                    back = cap;
                }
            }

            result += haveToGo * 2L;
        }

        return result;
    }
//    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
//        /**
//         * 가장 멀리 있는 집부터 해결
//         * 멀리있는 집에 배달 해야하는 수와 수거해와야하는 수를 가지고 전략을 짜야함
//         * 가장 멀리 부터 계산
//         * 배달해야하는 수를 cap과 비교
//         */
//        int result = 0;
//        int go = 0;
//        int back = 0;
//        int haveToGo = 0;
//
//        for (int i = 0; i < n; i++) {
//            int index = n - i - 1;  //가장 멀리 부터 계산
//
//            //배달을 계산
//            go += deliveries[index];
//            //픽업을 계산
//            back += pickups[index];
//
//            if (!(go == 0 & back == 0)) {   //그 인덱스에서 하나라도 들어가면 거기는 들려야함
//                if (haveToGo == 0) haveToGo = index + 1;
//                if (go >= cap || back >= cap) { //둘중 하나라도 가득찬다면 그 위치까지 갔다와서 해결해야함
//                    deliveries[index] = deliveries[index] - cap;
//                    pickups[index] -= cap;
//
//                    result += haveToGo * 2;
//                    haveToGo = 0;
//                    go = 0;
//                    back =0;
//                    //그 위치에 남은 물건이 있는경우 다시 갔다와야함
//                    if (deliveries[index] > 0) {
//                        go = deliveries[index];
//                        haveToGo = index + 1;
//                    }
//                    if (pickups[index] > 0) {
//                        back = pickups[index];
//                        haveToGo = index + 1;
//                    }
//                }
//            }
//
//        }
//        long answer = result;
//        return answer;
//    }
}
