package myJava.bootcamp.section6.challenges;

public class ForRectangleAndCuboid {
    public static void main(String[] args) {
        myJava.bootcamp.section6.challenges.Rectangle rectangle = new Rectangle(5.0, 10.0);
        Cuboid cuboid = new Cuboid(rectangle.getWidth(), rectangle.getLength(),
                5);

        System.out.println(rectangle.getArea());
        System.out.println(cuboid.getVolume()); 
    }
}