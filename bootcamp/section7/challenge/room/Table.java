package java.bootcamp.section7.challenge.room;

public class Table {

    private Dimensions dimensions;
    private boolean hasDrawer;

    public Table(Dimensions dimensions, boolean hasDrawer) {
        this.dimensions = dimensions;
        this.hasDrawer = hasDrawer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean getHasDrawer() {
        return hasDrawer;
    }

    public void cleanTable() {
        System.out.println("Cleaning table...");
    }
}
