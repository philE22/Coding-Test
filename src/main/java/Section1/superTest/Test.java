package Section1.superTest;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("rkrk");
    }
}

class Human {
    public Human() {
        System.out.println("휴먼 클래스 기본 생성자");
    }
    public Human(String name) {
        this();
        System.out.println("휴먼 클래스 이름 생성자");
    }
    public Human(int age) {
        System.out.println("휴먼 클래스 나이 생성자");
    }

}

class Student extends Human {
    public Student() {
        System.out.println("학생 클래스 생성자");
    }

    public Student(String name) {
        System.out.println("학생 클래스 이ㅡㄹㅁ 생성자");
    }
}
