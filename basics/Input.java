package myJava.basics;
// 2

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        // input variable of scanner type is equal to the instance of Scanner.
        // System.in == keyboard
        // from where you want to take the input will become parameter in Scanner.
        Scanner input_object = new Scanner(System.in); // we are taking input here.
        // input.nextInt() for taking integers as input.
        // input.next() for taking only one word string as input.
        // input.nextline() for taking a string as input.
        // input.nextFloat() for taking a float value as input.
        System.out.println("Enter a floating point number below:");
        float num = input_object.nextFloat();
        System.out.println(num);
    }
}