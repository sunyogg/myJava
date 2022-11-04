package myJava.bootcamp.section7.challenge.room;

public class Window {

    private Dimensions dimensions;
    private boolean mesh;

    public Window(Dimensions dimensions, boolean mesh) {
        this.dimensions = dimensions;
        this.mesh = mesh;
    }

    public void openWindow() {
        System.out.println("Window is now Open.");
    }

    public void closeWindow() {
        System.out.println("Window has been closed.");
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public boolean isMesh() {
        return mesh;
    }

    public void cleanWindow() {
        System.out.println("Cleaning window...");
    }

}
