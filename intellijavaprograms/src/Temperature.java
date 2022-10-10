
// 9

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        // create a input object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in c: ");
        float tempc = input.nextFloat();
        float tempf = (tempc * (9/5)) + 32;
        System.out.print("The temperature in fahrenheit is "+ tempf+'.');
    }
}