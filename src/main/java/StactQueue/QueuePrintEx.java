package StactQueue;

import java.util.*;
import java.util.stream.Collectors;

public class QueuePrintEx {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        QueuePrintEx ex = new QueuePrintEx();
        int a = ex.queuePrinter(bufferSize, capacities, documents);
        System.out.println(a); // 8
    }

    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:

        int count = 0;
        Queue<Integer> buffer = new LinkedList<>();
        for(int i=0; i < bufferSize; i++){
            buffer.add(0);
        }

        buffer.poll();
        buffer.add(documents[0]);
        documents = Arrays.copyOfRange(documents, 1, documents.length);
        count++;

        while (documents.length != 0 || buffer.stream().reduce(0, Integer::sum) != 0) {
            if(documents.length != 0){
                buffer.poll();
                int sum = buffer.stream().reduce(0, Integer::sum) + documents[0];
                if(sum <= capacities){
                    buffer.add(documents[0]);
                    documents = Arrays.copyOfRange(documents, 1, documents.length);
                } else {
                    buffer.add(0);
                }
                count++;

            } else {
                buffer.poll();
                buffer.add(0);
                count++;
            }
        }
        return count;
//git test
//        Queue<Integer> buffer = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();
//        for (int doc : documents) {
//            list.add(doc);
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//
//        while (list.size() > 0) {
//                if(buffer.stream().mapToInt(x -> x).sum() + list.get(0) <= capacities){
//                    buffer.add(list.get(0));
//                    list = list.subList(1, list.size());
//                } else {
//                    buffer.add(0);
//                }
//                if(buffer.size() >= bufferSize){
//                    result.add(buffer.poll());
//                }
//        }
//        return result.size() + bufferSize * 2 - 1;
    }
}
