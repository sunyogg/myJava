package myJava.bootcamp.section6.challenges;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double height, double width) {
        if (height < 0) {
            this.length = 0;
        } else {
            this.length = height;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return (this.width * this.length);
    }


}