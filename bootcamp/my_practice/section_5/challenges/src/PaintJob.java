import java.lang.Math;

public class PaintJob{

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static long getBucketCount(double width, double height,
                                      double areaPerBucket, int extraBucket) {
        // know the width and height of wall to find the area of the wall
        // bucketsToBuy = totalBucketsRequired - bucketsAtHome.
        if (width <=0 || height <=0 || areaPerBucket <=0 || extraBucket < 0) {
            return -1;
        }
        double areaOfWall = width * height;
        double numOfBucketToBuy =  (areaOfWall / areaPerBucket);
        int numOfBucketToBuyActually = (int)(numOfBucketToBuy + 1);
        int totalBucket = numOfBucketToBuyActually - extraBucket;
        return totalBucket;
    }

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket) {
        // not buckets at home, all have to be brought from market.
        double areaOfWall = width * height;
        int numOfBucketsToBuy = (int) ((areaOfWall/areaPerBucket) + 1);
        return numOfBucketsToBuy;
    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket) {
        // don't know width and height, but know the area of the wall.
        return (int) (areaOfWall/areaPerBucket + 1);
    }
}