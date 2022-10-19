package Section1.StreamTest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(new String[]{"a", "b", "c", "d", "e","f","g"}, 1, 4);
        stream.forEach(System.out::println);

        IntStream stream1 = IntStream.range(3, 9);
        stream1.forEach(System.out::println);
    }



}
