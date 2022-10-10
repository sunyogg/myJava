public class Vehicle {

    // fields
    private String model;
    private String manufacturer;
    private int maxSpeed;
    private int average;
    private int year;
    private String type;
    private boolean isManual;

    // constructor
    public Vehicle(String model, String manufacturer, int maxSpeed, int average,
                   int year, String type, boolean isManual) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.average = average;
        this.year = year;
        this.type = type;
        this.isManual = isManual;
    }

    public void brake() {
        System.out.println("Vehicle is braking");
    }

    public void move(int speed) {
        if (speed <= maxSpeed) {
            System.out.println("vehicle moving with " + speed);
        }
        else {
            System.out.println("vehicle moving with " + this.maxSpeed);
        }
    }

    public void fillFuel() {
        System.out.println("Vehicle getting filled with fuel");
    }

    public void getAverage() {
        System.out.println("Vehicle can drive upto " + this.average +
                " when the fuel is full.");
    }

}