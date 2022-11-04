package myJava.bootcamp.section6.challenges;

public class MainForPoint {
    public static void main(String[] args) {
        myJava.bootcamp.section6.challenges.Point cPoint = new myJava.bootcamp.section6.challenges.Point(6, 5);
        myJava.bootcamp.section6.challenges.Point second = new Point(3, 1);
        System.out.println(cPoint.getDistance());
        System.out.println(cPoint.getDistance(second));
        System.out.println(cPoint.getDistance(2, 2));
    }
}