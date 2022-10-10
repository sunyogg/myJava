public class ManualCar extends Vehicle {

    private int numOfGear;
    private boolean isManual;
    public ManualCar(String model, String manufacturer, int average,
                     int numOfGear) {

        super(model, manufacturer, 240, average, 1980, "manual", true);

        this.numOfGear = numOfGear;
        this.isManual = true;
    }

    public void changeGear() {
        System.out.println("ManualCar is changing gear.");
    }

    public void pressClutch() {
        System.out.println("ManualCar is pressing the clutch.");
    }

    public void fillFuel() {
        System.out.println("ManualCar is filling diesel in the fuel tank.");
    }

    public void changeOil() {
        System.out.println("ManualCar's fuel is getting changed.");
    }
}