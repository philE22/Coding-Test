package Kakao.level1;

import java.util.HashMap;

public class No5 {
    public static void main(String[] args) {
        No5 test = new No5();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(test.solution(numbers, hand));
    }

    public String solution(int[] numbers, String hand) {
        //1, 4, 7은 L   3, 6, 8는 R
        //2,5,8은 거리에 따라 결정
        //거리는 x, y 좌표값 주고 차이로 계산
        HashMap<Integer, int[]> map = new HashMap<>();
        map.put(1, new int[]{0, 3});
        map.put(2, new int[]{1, 3});
        map.put(3, new int[]{2, 3});
        map.put(4, new int[]{0, 2});
        map.put(5, new int[]{1, 2});
        map.put(6, new int[]{2, 2});
        map.put(7, new int[]{0, 1});
        map.put(8, new int[]{1, 1});
        map.put(9, new int[]{2, 1});
        map.put(0, new int[]{1, 0});
        map.put(10, new int[]{0, 0});    //*
        map.put(11, new int[]{2, 0});    //#

        StringBuilder sb = new StringBuilder(); //결과값 담을 빌더
        int left = 10;   //맨 처음 손가락 위치
        int right = 11;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = num;
            } else if (num == 2 || num == 5 || num == 8 || num == 0) {
                int[] numIndex = map.get(num);
                int[] leftIndex = map.get(left);
                int[] rightIndex = map.get(right);

                int leftDistance = Math.abs(numIndex[0] - leftIndex[0]) + Math.abs(numIndex[1] - leftIndex[1]);
                int rightDistance = Math.abs(numIndex[0] - rightIndex[0]) + Math.abs(numIndex[1] - rightIndex[1]);

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = num;
                } else if (leftDistance > rightDistance) {
                    sb.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = num;
                    } else {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }

        String answer = sb.toString();
        return answer;
    }
}
