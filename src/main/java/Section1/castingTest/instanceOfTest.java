package Section1.castingTest;

public class instanceOfTest {

    static class A {

    }
    static class B extends A {



    }

    public static void main(String[] args) {

        A test1 = (A) new B();  // (A)생략 가능
        System.out.println(test1 instanceof A);
        System.out.println(test1 instanceof B);

        B test2 = (B)test1;
        System.out.println(test2 instanceof A);
        System.out.println(test2 instanceof B);
    }
}
