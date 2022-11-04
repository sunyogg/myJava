package java.basics;
//8

// automatic type promotion in java in terms of which data type is bigger.
// byte -> short -> char -> int -> long -> float -> double

public class TypePromotion {
    public static void main(String[] args){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.57f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println(f*b+" "+i/c+" "+d*s);
        System.out.println(result);
        /*
        (f*b) -> float * byte -> float
        (i/c) -> int * char -> int
        (d*s) -> double * short -> double

        float + int - double -> double
        */

    }
}