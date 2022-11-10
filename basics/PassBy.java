package myJava.basics;

public class PassBy {
    public static void main(String[] args) {
        System.out.println("before: ");
        int test = 5;
        One testObject = new One(25);

        System.out.println(test);
        System.out.println(testObject.data);

        // Primitives are pass by value.
        changeValue(test);
        // Objects are pass by reference.
        changeValue(testObject);

        System.out.println("\nafter: ");
        System.out.println(test);
        System.out.println(testObject.data);

    }

    public static void changeValue(int data) {
        data = 69;
    }

    public static void changeValue(One datas) {
        datas.data = 6999;
    }

}

class One {
    int data;
    public One(int data) {
        this.data = data;
    }
}