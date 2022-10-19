package Section1.collectionTest;

import java.util.*;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {



        HashMap<String, Integer> map = new HashMap<>();

        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);
        System.out.println(map);

        System.out.println("총 entry 수 : " + map.size());

        System.out.println("파이리 : " + map.get("파이리"));

        //Key를 요소로 가지는 Set생성 -> 아래에서 순회하기 위해 필요합니다.
        Set<String> keySet = map.keySet();

        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }


        map.remove("피존투");

        System.out.println("총 entry 수: " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        map.clear();

    }
}
