package Section1;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("tesla");
        Car car3 = new Car("blue", "bmw");
        car1.method();
        car2.method();
        car3.method();
    }
}

class Car {


    String color;
    String model = "hyundai";


    public Car() {
        this.color = "reeeeeed";
        System.out.println("기본 생성자 메서드");
    }


    public Car(String model) {
        this();
        this.model = model;
    }

    public Car(String color, String model) {
        this();
        this.color = color;
        this.model = model;
    }


    public void method() {
        System.out.println(this.model + " " + this.color);
    }


}
