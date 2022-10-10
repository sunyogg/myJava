public class Door {

    private Dimensions dimensions;
    private String knobType;
    private boolean hasLock;

    public Door(Dimensions dimensions, String knobType, boolean hasLock) {
        this.dimensions = dimensions;
        this.knobType = knobType;
        this.hasLock = hasLock;
    }

    public void openDoor() {
        System.out.println("The door is now open.");
    }

    public void closeDoor() {
        System.out.println("The door is now closed.");
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public String getKnobType() {
        return this.knobType;
    }

    public boolean isHasLock() {
        return this.hasLock;
    }

    public void cleanDoor() {
        System.out.println("Cleaning door...");
    }
}
