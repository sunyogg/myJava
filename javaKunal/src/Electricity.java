
// 10

// If statement.

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args){
        // create a input object
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter the Electricity consumed in unit: ");
//        int a = input.nextInt();
//
//        // if statements.
//        if (a<100){
//            double b = a * 0.5;
//            System.out.print("Your bill is: ");
//            System.out.println(b+" Rs.");
//        }
//
//        else if (100 < a  &&  a <= 200){
//            double b = a * 2;
//            System.out.print("Your Bill is: ");
//            System.out.println(b+" Rs.");
//        }
//
//        else if (201 < a && a <= 400){
//            double b = a * 3;
//            System.out.print("Your Bill is: ");
//            System.out.println(b+" Rs.");
//        }
//
//        else {
//            double b = a * 5;
//            System.out.print("Your bill is: ");
//            System.out.println(b+" RS.");
//        }
        // shorthand if else.
        int val = 20;
//      variable = (condition) ? expressionTrue :  expressionFalse;
        String s = (val > 10)? (val+" is greater than 10"): (val+" is less than 10");
        System.out.println(s);

    }
}