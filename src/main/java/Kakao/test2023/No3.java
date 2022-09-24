package Kakao.test2023;

import java.util.*;
import java.util.stream.Collectors;

public class No3 {
    public static void main(String[] args) {
        No3 test = new No3();
        int[][] users = {{40, 10000}, {25, 10000}};
        int[] emoticons = {7000, 9000};
        Arrays.stream(test.solution(users, emoticons)).forEach(System.out::println);
    }

    public int[] solution(int[][] users, int[] emoticons) {
        /**
         * 가장 높은 가격의 이모티콘부터 높은 할인율을 적용시켜 사게 만들어야함
         * 최대한 리미트 금액을 넘기게 하면서 적은 할인율로 사게 해야함
         * 최대한 적은 할인율로 리미특 금액을 넘기게 해야함
         *
         */
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < users.length; i++) {
            set.add(users[i][0]);
        }
        int[] sale = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(sale);
        //가장 높은 할인율을 적용시키면 모두 사게되지만 총합 금액이 안 넘을수도있음
        //그러면 가격이 적은 이모티콘 부터 점차 낮은 할인율을 적용




        int[] answer = {};
        return answer;
    }


}
