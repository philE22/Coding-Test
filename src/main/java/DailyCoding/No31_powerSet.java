package DailyCoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class No31_powerSet {
    public static void main(String[] args) {
        String str = "bbaaa";
        No31_powerSet test = new No31_powerSet();
        System.out.println(test.powerSet(str));

    }

    public ArrayList<String> powerSet(String str) {
        // TODO:
        // 각 요소들을 포함하는 경우의 수
        //
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (char chr : arr) {
            set.add(String.valueOf(chr));
        }
        Iterator<String> iterator = set.iterator();
        ArrayList<String> list = new ArrayList<>();

        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        int length = list.size();
        String output = "";
        ArrayList<String> result = new ArrayList<>();
        result.add("");

        permutation(list, output, result, 0);
        return result;
    }

    public String permutation(ArrayList<String> list, String output, ArrayList<String> result, int cnt) {
        if (cnt == list.size()) return output;


        String addoutput = output + list.get(cnt);
        result.add(addoutput);
        permutation(list, addoutput, result, cnt + 1);

        permutation(list, output, result, cnt + 1);

        return null;
    }
}
