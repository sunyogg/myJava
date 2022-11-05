package myJava.oops.Revise.staticvar;

public class Main {
    public static void main(String[] args) {
        Human man = new Human("Sunyog", 20, 5.10, 70, "brown");
        Human woman = new Human("divya", 19, 5.5, 50, "brown");
        System.out.println(Human.population);
        System.out.println(Human.population);
    }

    static void message() {
//        greetings(); uncomment this (error)

        // Only way we can make this work is to create an object of class and
        // then access those non-static methods.
        Main obj = new Main();
        obj.greetings();;
    }
    // message   - not dependent on instances.
    // greetings - dependent on instances.
    // message does depend on instances that how can you have something (greetings)
    // inside it that depends on instances.

    void greetings() {
        System.out.println("Hello There");
    }

    void messageTwo() {
        greetings();
    }
    // Here it is not showing error, because we are calling a non-static method
    // from a non-static context, in other words, in order to use messageTwo()
    // we will always have to create an object (without object it is impossible
    // to call messageTwo) and if we are going to create an object then greeting()
    // which is also a non-static method can work fine (since we now have an object)


    // this points to an object, but we are in a static method, we don't need an
    // object there.
    static void comment() {
//        this.age; uncomment this. (error)
    }
}