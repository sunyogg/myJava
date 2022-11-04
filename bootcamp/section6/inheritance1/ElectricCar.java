package myJava.bootcamp.section6.inheritance1;

public class ElectricCar extends Cars {

    int batteryCapacity;
    int timeToFullCharge;

    public ElectricCar(String model, String manufacturer,
                       String color, int batteryCapacity,
                       int timeToFullCharge, int maxSpeed) {
        super(model, manufacturer, "Electric Sedan", 4, color, 2, maxSpeed);

        this.batteryCapacity = batteryCapacity;
        this.timeToFullCharge = timeToFullCharge;
    }

    public void fillTank() {
        System.out.println("Charging the car...");
        super.fillTank();
    }
}
