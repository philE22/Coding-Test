package LamdaTest;

public class LamdaTest {


    public static void main(String[] args) {
//        Object obj = new Object() {
//            public int sum(int num1, int num2) {
//                return num1 + num2;
//            }
//        };


        ExampleFunction ef = (num1, num2) -> num1 + num2;
        System.out.println(ef.sum(10, 15));
//        System.out.println(obj.sum(32, 12));
    }
}


interface ExampleFunction{
    public abstract int sum(int num1, int num2);
}
