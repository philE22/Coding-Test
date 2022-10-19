package Section1.LamdaTest;

import java.util.function.IntBinaryOperator;

public class MethodReferenceTest {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = Calculator::staticMethod;
        System.out.println("정적메서드 결과 : " + operator.applyAsInt(3, 5));

        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과 : " + operator.applyAsInt(3, 5));

    }
}

class Calculator {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    public int instanceMethod(int x, int y) {
        return x * y;
    }

}