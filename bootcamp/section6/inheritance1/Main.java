package java.bootcamp.section6.inheritance1;

public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("r8", "audi", "sedan", 4, "grey", 2, 220);
        System.out.println(car.getInfo());

        ElectricCar eCar = new ElectricCar("model s", "tesla", "white",
                200, 4, 260);
        System.out.println();
        System.out.println(eCar.getInfo());

        eCar.fillTank();
//        car.fillTank();


//        car.incrementOdometerReading(50);
//        System.out.println(car.getOdometerReading());
//        System.out.println(eCar.getOdometerReading());

    }
}