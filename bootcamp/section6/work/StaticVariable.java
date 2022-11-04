
package myJava.bootcamp.section6.work;

public class StaticVariable {

    private static String name;

    public StaticVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable("fluffy");
        StaticVariable obj2 = new StaticVariable("tiger");

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
    }

}
// STATIC VARIABLE

// static variables are shared between instances.

// it's like all the instance of the class will always points to the same
// static variable and therefore changing the static variable using any instance
// will change the static variable for all the instance.

// static variable are like universal variable which are same for every instance
// of a class. And if we try to change the static variable then it gets changed
// for every instance of the class.


// INSTANCE VARIABLE
// They are also known as fields of a class.
// Each instance/object has it's own copy of all the instance variable defined
// in the class.
// Instance variable represent the state of an instance.