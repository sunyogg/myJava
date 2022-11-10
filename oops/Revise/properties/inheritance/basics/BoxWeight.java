package myJava.oops.Revise.properties.inheritance.basics;

public class BoxWeight extends Box {
    protected double weight;

    public BoxWeight() {
        // automatic super() call?
        // Are we here calling an empty constructor from parent class?
        // super() ? is this is what happening here?
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        // super calls the NECESSARY constructor from parent class.
        this.weight = other.weight;
    }

    public static void greetings() {
        System.out.println("I am in boxWeight class. Greetings.");
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); // calling the constructor of parent class.
        this.weight = weight;
//        System.out.println(super.height);
        // super can be used to explicitly access parent class fields and
        // methods in child class.
    }


}