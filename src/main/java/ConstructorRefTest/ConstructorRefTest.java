package ConstructorRefTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRefTest {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("kimcoding");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("kimkofing", "김코딩");
    }
}
