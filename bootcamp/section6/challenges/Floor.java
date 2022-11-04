package java.bootcamp.section6.challenges;

public class Floor {

    private double x;
    private double y;

    public Floor(double x , double y) {
        if (x < 0) {
            this.x = 0;
        } else {
            this.x = x;
        }
        if (y < 0) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }


    public double getArea() {
        return (this.x * this.y);
    }
}