package myJava.bootcamp.section7.composition;

public class Dimensions {

    private int height;
    private int width;
    private int length;

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.length = depth;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }
}