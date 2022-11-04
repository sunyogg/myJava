package myJava.bootcamp.section7.challenge.room;

public class Bed {
    private Dimensions dimensions;
    private String foamType;
    private boolean hasSpring;

    public Bed(Dimensions dimensions, String foamType, boolean hasSpring) {
        this.dimensions = dimensions;
        this.foamType = foamType;
        this.hasSpring = hasSpring;
    }

    public void makeBed() {
        System.out.println("Making Bed.");
    }

    public void cleanBed() {
        System.out.println("Cleaning bed...");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getFoamType() {
        return foamType;
    }

    public boolean isHasSpring() {
        return hasSpring;
    }
}
