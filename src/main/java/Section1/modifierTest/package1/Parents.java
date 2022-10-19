package Section1.modifierTest.package1;

class Test {
    public static void main(String[] args) {
        Parents p = new Parents();

        //System.out.println(p.a);
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}

public class Parents {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void printEach() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
