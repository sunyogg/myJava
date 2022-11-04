package myJava.basics;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 'b'); // new object is being created ab
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        System.out.println("a" + new ArrayList<Integer>());
//        System.out.println('a' + new ArrayList<Double>());
        System.out.println( Integer.toString(56) + new ArrayList<Integer>() );

        // "+" besides addition operator can be used between two primitves.
        // If you want to use between objects than one has to be of String type.
    }
}