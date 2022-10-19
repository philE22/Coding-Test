package Kakao.level1;

import java.util.ArrayList;

public class No4 {
    public static void main(String[] args) {
        No4 test = new No4();
        String dartResult = "1D2S#10S";
        System.out.println(test.solution(dartResult));
    }

    public int solution(String dartResult) {
        ArrayList<Integer> list = new ArrayList<>();    //나온 값들을 담을 list
        char[] chars = dartResult.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            int lastIndex = list.size() - 1;
            int secondIndex = list.size() - 2; //뒤에서 두번째 인덱스

            if (Character.isDigit(chr)) {   //숫자일때
                if (i > 0 && chars[i - 1] == '1' && chr == '0') {   //숫자가 10일 때 처리해줘야함
                    list.remove(list.size() - 1);
                    list.add(10);

                } else list.add(Character.getNumericValue(chr));

            } else if (chr == 'D') {
                list.set(lastIndex, (int) Math.pow(list.get(lastIndex), 2));

            } else if (chr == 'T') {
                list.set(lastIndex, (int) Math.pow(list.get(lastIndex), 3));

            } else if (chr == '*') {
                if (list.size() == 1) {
                    list.set(0, list.get(0) * 2);
                } else {
                    list.set(lastIndex, list.get(lastIndex) * 2);
                    list.set(secondIndex, list.get(secondIndex) * 2);
                }
            } else if (chr == '#') {
                list.set(lastIndex, list.get(lastIndex) * -1);
            }

        }

        int answer = list.stream().mapToInt(i -> i).sum();
        return answer;
    }
}
