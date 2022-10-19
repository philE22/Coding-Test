package Kakao.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class No2 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        No2 test = new No2();
        System.out.println(test.solution(s));
    }


    public int solution(String s) {
        String[] alphabet = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(alphabet[i], String.valueOf(i));
        }

        int answer = Integer.parseInt(s);
        return answer;
    }

}
