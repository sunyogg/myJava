package myJava.oops.Revise.properties.polymorphism.upcasting;

import myJava.oops.Revise.properties.polymorphism.upcasting.Shapes;

public class Triangle extends Shapes {

    @Override
    public void area() {
        System.out.println("0.5 * base * height");
    }
}
