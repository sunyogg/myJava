public class FeetAndInches{

    public static double calcFeetAndInchesToCentimeter(double feet,
                                                       double inches) {
        // This method will convert feet and inches to centimeter.
        double centimeter = feet * 12 * 2.54;
        centimeter += inches * 2.54;
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        // this method will take inches convert it to feet and inch and
        // then convert it to inches.
        double feet = (int) (inches/12);
        double inch = inches % 12;
        return calcFeetAndInchesToCentimeter(feet, inch);
    }
}