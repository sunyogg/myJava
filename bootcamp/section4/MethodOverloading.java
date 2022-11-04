package myJava.bootcamp.section4;

public class MethodOverloading {

    public static void main(String[] args) {
        greet("hello");
        greet(125);
        greet("hello", 125);
        greet();
    }

    public static void greet(String letter) {
        System.out.println("This greet() method takes letter as a parameter.");
    }

    public static void greet(int number) {
        System.out.println("This greet() method only takes a number " +
                "as parameter.");
    }

    public static void greet(String letter, int number) {
        System.out.println("This greet() method takes" +
                " a number and letter simultaneously as parameter.");
    }

    public static void greet() {
        System.out.println("This greet() method does not take any parameters.");
    }
}

