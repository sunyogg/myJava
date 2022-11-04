package java.bootcamp.section6.challenges;

public class Cylinder extends Circle {

    private double height;
    public Cylinder(double height, double radius) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return (getArea() * this.height);
    }


}