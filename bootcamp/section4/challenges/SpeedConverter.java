package java.bootcamp.section4.challenges;

import java.lang.Math;
public class SpeedConverter{

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
         long miles =  Math.round(kilometersPerHour * 0.621371);
        return miles;
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (miles == -1) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println( kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}

