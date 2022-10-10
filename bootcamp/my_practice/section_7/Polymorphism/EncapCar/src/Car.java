public class Car {

    private String name;
    private int wheels = 4;
    private boolean engine = true;
    private int horsePower;

    public Car(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void startCar() {
        System.out.println("CAR : Starting car...");
    }

    public void accelerate() {
        System.out.println("CAR: Accelerating car...");
    }
}