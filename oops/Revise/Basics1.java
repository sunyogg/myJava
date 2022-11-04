package java.oops.Revise;

import java.util.Scanner;
public class Basics1 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Student sanyog = new Student("Sunyog", 183, 54);
        Student random = new Student();
//       random.printDetail();
        Test t = new Test();

        // two variables pointing at same object, any of the variable can be used
        // to change the state of the object.
        Student one = new Student("one", 1, 1);
        Student two = one;
        one.name = "three";
        two.name = "four";
        one.printDetail();
        two.printDetail();
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    // Calling a constructor from another constructor.
    // internally: new Student("default", 0, 100.0);
    public Student() {
        this("default", 0, 100.0);
    }

    // passing object of same class in constructor of same class.
    public Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    // In constructors, we are always going to need to put this keyword.
    // It'll throw error, as java will get confused.
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void printDetail() {
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.marks);
    }
}

class Test {
    Test() {
        this.greet();
    }
    void greet() {
        System.out.println("Hello World! How are you?");
    }
}

// java is pass by value for primitives but when we pass objects, their reference
// is passed.