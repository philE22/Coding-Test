package Section1.StreamTest;

import java.util.Arrays;
import java.util.stream.Stream;

public class flatmapTest {
    public static void main(String[] args) {
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});

        stringArraysStream.map(Arrays::stream).forEach(System.out::println);
    }
}
