package LamdaTest;

public class LamdaExample1 {
    public static void main(String[] args) {
        MyFunctionalInterface example;
        example = () -> {
            String str = "첫번째 메서드 호출!";
            System.out.println(str);
        };

        example.accept();

        example = () -> System.out.println("두 번쨰 메서드 호출!");
        example.accept();
    }
}

interface MyFunctionalInterface {

    public abstract void accept();
}
