package BaekJoon.level5;

import java.util.ArrayList;

public class No4673 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            if (!list.contains(i)) System.out.println(i);
            String strNum = String.valueOf(i);
            char[] chars = strNum.toCharArray();
            int sum = i;
            for (char c : chars) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            list.add(sum);
        }
    }
}
