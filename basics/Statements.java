package java.basics;// 14

import java.util.Scanner;

public class Statements{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // if statement
        if (num > 10){
            System.out.println(num+" a is greater than 10.");
        }
        // else statement
        else {
            System.out.println(num+" is lower than 10.");
        }

    }
}