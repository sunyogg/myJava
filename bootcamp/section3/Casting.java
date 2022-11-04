package java.bootcamp.section3;

public class Casting {
    public static void main(String[] args){
        byte myByteMax = Byte.MAX_VALUE;
        short myShortMax = Short.MAX_VALUE;
        System.out.println(myByteMax);
        System.out.println(127/2);

        byte byteFinalResult = (byte) (myByteMax/2);
        System.out.println(byteFinalResult);

        short shortFinalResult = (short) (myShortMax/2);
        System.out.println(shortFinalResult);

    }
}
