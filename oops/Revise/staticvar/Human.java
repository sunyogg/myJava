package myJava.oops.Revise.staticvar;

// Static fields are the fields that are common to every instance of the class.
// They should be accessed using class reference.
// Something that is not static belongs to an object.
// Something that is static is object independent.
// Static     - NOT dependent
// non-static - DEPENDENT

// Since objects are created during runtime, and static methods/variables
// have nothing to do with objects hence they are resolved during compile time.

public class Human {
    String name;
    int age;
    double height;
    double weight;
    String color;
    static int population;

    public Human(String name, int age, double height, double weight, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.color = color;
        Human.population ++;
    }
}