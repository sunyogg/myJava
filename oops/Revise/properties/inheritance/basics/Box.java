package myJava.oops.Revise.properties.inheritance.basics;

public class Box {
    protected double length;
    protected double width;
    protected double height;

    public static void greetings() {
        System.out.println("I am in Box class. Greetings.");
    }

    public Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box oldBox) {
        this.length = oldBox.length;
        this.width = oldBox.width;
        this.height = oldBox.height;
    }

    public void printDetail() {
        System.out.println(this.length + " " + this.width + " " + this.height);
    }
}