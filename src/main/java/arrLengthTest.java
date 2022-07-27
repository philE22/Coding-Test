import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class arrLengthTest {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        for(int i=0; i < 5; i++){
            buffer.add(i);
        }

        System.out.println(buffer.stream().reduce(0, Integer::sum));
    }
}
