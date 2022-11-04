package java.bootcamp.section7.polymorphism.car;

public class Tesla extends Car {

    private int batterySize = 120;

    public Tesla(String name, int horsePower) {
        super(name, horsePower);
    }

    @Override
    public void startCar() {
        System.out.println("Tesla : Starting " +
                getClass().getSimpleName() + "...");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla : accelerating " +
                getClass().getSimpleName() + "...");
    }

    public int getBatterySize() {
        return batterySize;
    }
}
