package Section1.LamdaTest;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> printString = text -> System.out.println("Miss " + text + "?");
        Consumer<String> printString2 = text -> System.out.println("---> Yes, " );
        printString.andThen(printString2).accept("me");
    }
}
