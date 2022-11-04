package myJava.oops;// Pass by value and pass by reference.

public class PassByValue {
    public static void main(String[] args) {
        final Students one = new Students("one", 1, 1, 1.00);
        Students five = new Students("five", 5, 5, 5.00);

        // When a non primitve is final, you cannot reassign it.
        // one = five;
        one.printDetail();
        five.printDetail();
        swap(one, five);
        one.printDetail();
        five.printDetail();

    }

    static void swap(Students a, Students b) {
        Students temp = a;
        a = b;
        b = temp;
    }


}

class Students {
    String name;
    int age;
    int rollNo;
    double marks;

    Students(String name, int age, int rollNo, double marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void printDetail() {
        System.out.print(this.name + " ");
        System.out.print(this.age + " ");
        System.out.print(this.rollNo + " ");
        System.out.println(this.marks);
    }
}