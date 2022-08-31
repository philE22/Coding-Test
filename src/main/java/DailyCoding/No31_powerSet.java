package DailyCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class No31_powerSet {
    public static void main(String[] args) {
        String str = "jjump";

        No31_powerSet test = new No31_powerSet();
        System.out.println(test.powerSet(str));
    }

    public ArrayList<String> powerSet(String str) {
        // TODO:
        // 각 요소들을 포함하는 경우의 수
        //
        char[] arr = str.toCharArray();
        HashSet<String> set = new HashSet<>();
        return null;
    }
}
