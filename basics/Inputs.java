package myJava.basics;
// 6

import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Creating an input object from scanner.
        System.out.print("Please enter your roll number: ");
        int roll_no = input.nextInt();// This is where we are taking the input.
        System.out.println("Your roll no. is " + roll_no+'.');

    }
}