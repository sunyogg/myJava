package myJava.bootcamp.section7.polymorphism.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti Suzuki", 900);
        Audi audi = new Audi("Audi R8", 2000);
        Tesla tesla = new Tesla("Tesla Model S", 1700);

        car.startCar();
        audi.startCar();
        tesla.startCar();

        System.out.println(audi.getWheels());
    }
}