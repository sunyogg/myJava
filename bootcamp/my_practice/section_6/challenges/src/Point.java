// Is this exercise including 33, 34 using "INSTANCES AS ARGUMENT"

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance() {
        // distance between the point(x, y) and point(0, 0)
        return (Math.sqrt(
                (this.x * this.x) + (this.y * this.y)));
    }

    public double getDistance(int p, int q) {
        // distance between point(x, y) and point (p, q)
        return Math.sqrt(
                ((p-this.x) * (p-this.x)) + ((q-this.y) * (q-this.y)));
    }

    public double getDistance(Point p) {
        return Math.sqrt(
                ((p.getX()-this.x) * (p.getX()-this.x)) + ((p.getY()-this.y) * (p.getY()-this.y)));
    }
}