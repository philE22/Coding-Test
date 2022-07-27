package StactQueue;

import java.util.*;

public class QueueBoxEx {
    public static void main(String[] args) {
        QueueBoxEx ex = new QueueBoxEx();
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        System.out.println(ex.paveBox(boxes));
        Queue<Integer> queue = new LinkedList<>();
        queue.poll();
    }

    public int paveBox(Integer[] boxes) {
        List<Integer> list = new ArrayList<>(Arrays.asList(boxes));
        ArrayList<Integer> result = new ArrayList<>();

        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(0) < list.get(i)) {
                    result.add(i);
                    list = list.subList(i, list.size());
                }
                if (i == list.size() - 1) {
                    result.add(list.size());
                    list.clear();
                }
            }
        }

//        return result.stream().mapToInt(x -> x).max().orElse(-1);
        return result.stream().max(Integer::compare).orElse(-1);


//        ArrayList<Integer> list = new ArrayList<>();
//        int result = 0;
//
//        if(boxes.length == 1) return 1;
//
//        list.add(boxes[0]);
//        for(int i = 1; i < boxes.length; i++){
//            if(list.get(0) >= boxes[i]){ // 뒤에 작은 숫자가 오는 경우
//                list.add(boxes[i]);
//
//                if(i == boxes.length - 1){ // 마지막 요소까지 작은 숫자인 경우
//                    int num = list.size();
//                    if(result <= num) result = num;
//                }
//
//            } else { // 뒤의 수가 더 큰 경우
//                int num = list.size();
//                if(result <= num) result = num;
//
//                list.clear();
//                list.add(boxes[i]);
//            }
//        }
//        return result;
    }
}
