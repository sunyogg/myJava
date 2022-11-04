package myJava.bootcamp.section7.polymorphism.car;


public class Audi extends Car {


    public Audi(String name, int horsePower) {
        super(name, horsePower);
    }

    public void startCar() {
        System.out.println("AUDI : Starting " + this.getName() + "...");
    }

    public void accelerate() {
        System.out.println("AUDI : accelerating " + this.getName() + "...");
    }
}