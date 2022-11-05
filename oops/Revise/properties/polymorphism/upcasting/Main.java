package myJava.oops.Revise.properties.polymorphism.upcasting;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        // UPCASTING
        // Dynamic method dispatch - It is just a mechanism by which call to
        // an overridden method is resolved at run time rather at compile time.
        // What happens if the type of reference is of parent class and
        // type of object is of child class?
        // EX - Parent objName = new Child();
        // It is the type of the reference variable and not the type of the
        // object that actually determines what members can be accessed.
        // What is being accessed does not depend on the object type, It
        // depends on the reference type (So here Shapes must contain area())
        // but java will not call area() from Shapes instead it'll call area()
        // from Circle class, Because circle class area() is OVERRIDING Shapes
        // class area().
        Shapes circle = new Circle();
        circle.area();
        // Reference type - What it is able to access.
        // Object type - Which it is going to access. (In case of OVERRIDING)

        Square square = new Square();
        Triangle triangle = new Triangle();
    }
}