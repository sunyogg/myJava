package java.bootcamp.section6.challenges;

import java.awt.*;

public class MainForPoint {
    public static void main(String[] args) {
        Point cPoint = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(cPoint.getDistance());
        System.out.println(cPoint.getDistance(second));
        System.out.println(cPoint.getDistance(2, 2));
    }
}