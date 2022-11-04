package java.bootcamp.section6.inheritance1;

public class Cars {

    private String model;
    private String manufacturer;
    private String type;
    private int capacity;
    private String fuelType;
    private String color;
    private int driveType;
    private int maxSpeed;
    private int odometerReading = 0;

    public Cars(String model, String manufacturer, String type, int capacity,
                String color, int driveType, int maxSpeed) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.capacity = capacity;
        this.color = color;
        this.driveType = driveType;
        this.maxSpeed = maxSpeed;
        this.fuelType = "Diesel";
    }

    public String getInfo() {
        return (this.model + "\n" + this.manufacturer + "\n" +
                this.type + "\n" + this.capacity + "\n" + this.color + "\n" +
                this.driveType + "\n" + this.fuelType);
    }

    public int maxSpeed() {
        return this.maxSpeed;
    }

    public void incrementOdometerReading(int amount) {
        if (amount > 0) {
            this.odometerReading += amount;
        } else {
            System.out.println("You can't decrease the odometer count.");
        }
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void fillTank() {
        System.out.println("Filling the gas tank with fuel...");
    }
}