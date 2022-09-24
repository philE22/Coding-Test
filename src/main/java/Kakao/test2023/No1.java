package Kakao.test2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class No1 {
    public static void main(String[] args) {
        No1 test = new No1();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        Arrays.stream(test.solution(today, terms, privacies)).forEach(System.out::println);
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todaySplits = today.split("\\.");
        int todayYear = Integer.parseInt(todaySplits[0]);
        int todayMonth = Integer.parseInt(todaySplits[1]);
        int todayDay = Integer.parseInt(todaySplits[2]);

        ArrayList<Integer> resultList = new ArrayList<>();  //결과 담을 리스트
        HashMap<String, Integer> termsMap = new HashMap<>();    //약관종류별 유효기간을 map에 넣음
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termsMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        for (int i = 0; i < privacies.length; i++){
            String[] s = privacies[i].split(" ");
            String privacyDay = s[0];
            int duration = termsMap.get(s[1]);  // 약관 종류에 맞는 유효기간을 꺼냄

            // 약관동의한 날짜에 유효기간을 더하고 오늘 날짜와 비교해서 파기할 개인정보를 찾으면 됨

            //유효기간 더하는 로직
            String[] splitDay = privacyDay.split("\\.");
            int year = Integer.parseInt(splitDay[0]);
            int month = Integer.parseInt(splitDay[1]);
            int day = Integer.parseInt(splitDay[2]);
            day -= 1;
            if (day == 0) {
                day = 28;
                month--;
            }
            if (month + duration > 12) {
                year++;
                month = month + duration - 12;
            } else month = month + duration;

            System.out.println(year +" " + month + " " + day);

            // 오늘 날짜와 비교하는 로직
            int todayTime = todayYear * 12 * 28 + todayMonth * 28 + todayDay;
            int expireTime = year * 12 * 28 + month * 28 + day;

            if (expireTime < todayTime) resultList.add(i + 1);
        }

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}
