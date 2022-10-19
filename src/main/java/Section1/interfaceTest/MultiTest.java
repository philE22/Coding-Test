package Section1.interfaceTest;

interface A {
    void method1();

    default void defaulfMethod() {
        System.out.println("aa");
    }
}

interface B {
    void method1();


}

class User implements A, B{
    @Override
    public void method1() {
        System.out.println("akakakak");
    }


}

public class MultiTest {
    public static void main(String[] args) {
        User user = new User();
        user.method1();
        user.defaulfMethod();
    }
}
