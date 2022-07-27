package innerStaticClassTest;

class Outer {
    private int num = 3;
    private static int sNum = 4;

    void getPrint() {
        System.out.println("인스턴스 메서드");
    }

    static void getPrintStatic() {
        System.out.println("스태틱 메서드");
    }

    static class StaticInClass { // 정적 내부 클래스
        void test() {
            System.out.println("Outer num = " + sNum + "(외부 클래스의 정적 변수)");
            getPrintStatic();
            // num 과 getPrint() 는 정적 멤버가 아니라 사용 불가.
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Outer.StaticInClass a = new Outer.StaticInClass();
        a.test();
    }
}
