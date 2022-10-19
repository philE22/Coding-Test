package Section1.CombinationTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BlackJackEx {
    public static void main(String[] args) {
        int[] cards = new int[]{2, 3, 4, 8, 13};
        BlackJackEx ex = new BlackJackEx();

        ArrayList<Integer[]> addCard = ex.blackJack(new Integer[3], cards, 0, new ArrayList<Integer[]>(),  0);
        Iterator<Integer[]> it = addCard.iterator();
        int numCount = 0;
        while (it.hasNext()) {
            boolean isPrime = false;
            Integer[] num = it.next();
            Integer integer = Arrays.stream(num).reduce(Integer::sum).get();
            System.out.println(integer);
            for (int i = 2; i < integer; i++) {
                if (integer % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) numCount++;
        }
        System.out.println(numCount);
    }

    public ArrayList<Integer[]> blackJack(Integer[] arr, int[] cards, int start, ArrayList<Integer[]> result,  int r) {
        if (r == 3) {
            result.add(arr);
            System.out.println(Arrays.toString(arr));
            return result;
        }

        for (int i = start; i < cards.length; i++) {
            arr[r] = cards[i];
            result = blackJack(arr, cards, i + 1, result, r + 1);
        }
        return result;
    }

//    public ArrayList<Integer[]> blackJack(Integer[] gameCard, int[] cards, int count, ArrayList<Integer[]> result, boolean[] checked) {
//        if (count == 3) {
//            result.add(gameCard);
//            System.out.println(Arrays.toString(gameCard));
//            return result;
//        }
//
//        for (int i = count; i < count + 3; i++) {
//            if(count + 3 < cards.length) {
//                gameCard[count] = cards[i];
//                checked[i] = true;
//                blackJack(gameCard, cards, count + 1, result, checked);
//                checked[i] = false;
//            }
//        }
//        return result;
//    }
}
