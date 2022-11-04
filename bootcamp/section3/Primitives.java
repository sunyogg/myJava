package java.bootcamp.section3;


public class Primitives{
    public static void main(String[] args){
	    int myValue = 10000;
		String myName = "sunyog";
	    int myMaxIntValue = Integer.MAX_VALUE;
	    int myMinIntValue = Integer.MIN_VALUE;


        double myMaxDoubleValue = Double.MAX_VALUE;
	    double myMinDoubleValue = Double.MIN_VALUE;

	    byte myMaxByteValue = Byte.MAX_VALUE;
	    byte myMinByteValue = Byte.MIN_VALUE;

	    long myMinLongValue = Long.MIN_VALUE;
	    long myMaxLongValue = Long.MAX_VALUE;

        float myMaxFloatValue = Float.MAX_VALUE;
	    float myMinFloatValue = Float.MIN_VALUE;

	    short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

	    System.out.println("maxInt " + myMaxIntValue);
	    System.out.println("minInt " + myMinIntValue);
	    System.out.println("maxByte " + myMaxByteValue);
	    System.out.println("minByte " + myMinByteValue);
	    //System.out.println("maxDouble " + myMaxDoubleValue);
        //System.out.println("minDouble " + myMinDoubleValue);
	    //System.out.println("maxLong " + myMaxLongValue);
        //System.out.println("minLong " + myMinLongValue);
	    //System.out.println("maxFloat " + myMaxFloatValue);
        //System.out.println("minFloat " + myMinFloatValue);
	    System.out.println("maxShort " + myMaxShortValue);
        System.out.println("minShort" + myMinShortValue);

		long myIntInLong = 2147483647;
		System.out.println(myIntInLong);

	/*
	 If you try to put a numeric value larger or smaller than the value
	 that a particular numeric data type support, then you will face
	 something known as OverFlow or UnderFlow in java. The computer just
	 skips back to the minimum or maximum number, which is usually not
	 what we want.
	*/
	    int bustedMinValue = myMinIntValue - 1;
	    int bustedMaxValue = myMaxIntValue + 1;
	    System.out.println("bustedMaxValue = " + bustedMaxValue);
	    System.out.println("bustedMinValue = " + bustedMinValue);

    }
}
