package Section1.inheritanceTest;



public class HelloJava {
    public static void main(String[] args) {
        Programmer p = new Programmer("company");
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.companyName);
    }
}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void learn() {
        System.out.println("공부를 합니다.");
    }

    void walk() {
        System.out.println("걷습니다.");
    }

    void eat() {
        System.out.println("밥을 먹습니다.");
    }
}

class Programmer extends Person {   // Person 클래스로부터 상속. extends 키워드 사용
    String companyName;

    public Programmer(String companyName) {
        super("dd", 2);
        this.companyName = companyName;
    }

    void coding() {
        System.out.println("코딩을 합니다.");
    }
}

//class Singer extends Person {
//    String bandName;
//
//    void singing() {
//        System.out.println("노래합니다.");
//    }
//
//    void playGuitar() {
//        System.out.println("기타를 칩니다.");
//    }
//}