package myJava.oops.Revise.properties.polymorphism.upcasting;

import myJava.oops.Revise.properties.polymorphism.upcasting.Shapes;

public class Square extends Shapes {

    @Override
    public void area() {
        System.out.println("sides * sides");
    }
}
