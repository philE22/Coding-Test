public class OverloadingTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        shape.area(3);
        shape.area(3, 5);
    }

}

class Shape {
    public void area() {
        System.out.println("입력값 없음");
    }

    public void area(int r) {
        System.out.println("원의 넓이: " + 3.14 * r * r);
    }

    public int area(int w, int l) {
        System.out.println("직사각형 넓이: " + w * l);
        return w * l;
    }
}
