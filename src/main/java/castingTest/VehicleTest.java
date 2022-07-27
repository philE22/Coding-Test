package castingTest;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        String name = car.name;
        car.giveRide();
        Vehicle vehicle = (Vehicle) car; //상위 클래스 Vehicle 타입으로 변환(생략 가능)
//        String name1 = vehicle.name;
//        vehicle.giveRide();
        Car car2 = (Car) vehicle; // 하위 클래스 Car타입으로 변환(생략 불가능)
        String name2 = car2.name;
        car2.giveRide();

//        MotorBike motorBike = (MotorBike) car; // 상속 관계가 아니므로 타입 변환 불가 -> 에러발생
    }
}

class Vehicle {
    String model;
    String color;
    int wheels;

    void startEngine() {
        System.out.println("시동 걸기");
    }

    void accelerate() {
        System.out.println("속도 올리기");
    }

    void brake() {
        System.out.println("브레이크!");
    }
}

class Car extends Vehicle {
    String name ="dsfsd";
    void giveRide() {
        System.out.println("다른 사람 태우기");
    }
}

class MotorBike extends Vehicle {
    void performance() {
        System.out.println("묘기 부리기");
    }
}