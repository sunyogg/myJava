package myJava.bootcamp.section6.challenges;

public class ForCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5.55);
        Cylinder cylinder = new Cylinder(7.25, circle.getRadius());

        System.out.println("area = " + String.format("%2f",circle.getArea()));
        System.out.println("Volume = " + String.format("%2f",cylinder.getVolume()));
        System.out.println("Height = " + cylinder.getHeight());
    }
}