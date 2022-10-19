package BaekJoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        int max = 0;
        char maxChar = 'a';
        boolean check = false;
        while (it.hasNext()) {
            Map.Entry<Character, Integer> next = it.next();
            if (next.getValue() == max) {
                check = true;
            }
            if (next.getValue() > max) {
                max = next.getValue();
                maxChar = next.getKey();
                check = false;
            }
        }

        if (check) System.out.println("?");
        else System.out.println(maxChar);
    }
}
