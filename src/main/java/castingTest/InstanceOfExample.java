package castingTest;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof  Object);
        System.out.println(animal instanceof  Animal);
        System.out.println(animal instanceof Bat);

        Animal cat = new Cat();
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Bat);
    }
}

class Animal {


}
class Bat extends Animal {

}
class Cat extends Animal {}