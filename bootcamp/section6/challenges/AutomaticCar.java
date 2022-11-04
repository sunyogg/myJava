package java.bootcamp.section6.challenges;

public class AutomaticCar extends Vehicle {

    private int numOfModes;

    public AutomaticCar(String model, String manufacturer, int numOfModes){
        super(model, manufacturer, 200, 60, 2015, "automatic", false);

        this.numOfModes = numOfModes;
    }

    public void changeMode() {
        System.out.println("AutomaticCar Changing modes");
    }

    public void fillFuel() {
        System.out.println("AutomaticCar is getting charged.");
    }

}