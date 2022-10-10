public class Chair {

    private Dimensions dimensions;
    private int capacity;
    private int numOfLegs;
    private boolean headRest;

    public Chair(Dimensions dimensions, int capacity, int numOfLegs,
                 boolean headRest) {
        this.dimensions = dimensions;
        this.capacity = capacity;
        this.numOfLegs = numOfLegs;
        this.headRest = headRest;
    }

    public void sitOnChair() {
        System.out.println("Sitting on the chair.");
    }

    public void moveChair(int x, int y) {
        System.out.println("Moving char to " + x + ", " + y + " in the room.");
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public boolean hasHeadRest() {
        return headRest;
    }

    public void cleanChair() {
        System.out.println("Cleaning Chair...");
    }
}
