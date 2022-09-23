package Kakao.level1;
//https://school.programmers.co.kr/learn/challenges?levels=1&partIds=31236%2C25448%2C20069%2C17214%2C12286%2C9317%2C22586%2C18498%2C17931&page=1&languages=java
public class No1 { //[1차] 비밀지도
    public static void main(String[] args) {
        No1 test = new No1();
        int[] int1 = {9, 20, 28, 18, 11};
        int[] int2 = {30, 1, 21, 17, 28};
        String[] solution = test.solution(5, int1, int2);
        for (String str : solution) {
            System.out.println(str);
        }
    }


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);

            if (a.length() < n) {
                String repeat = "0".repeat(n - a.length());
                a = repeat + a;
            }
            if (b.length() < n) {
                String repeat = "0".repeat(n - b.length());
                b = repeat + b;
            }

            char[] chars1 = a.toCharArray();
            char[] chars2 = b.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (chars1[j] == '1' || chars2[j] == '1') {
                    sb.append("#");
                } else sb.append(" ");
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
