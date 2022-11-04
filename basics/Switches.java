package myJava.basics;
//15

// Use the switch statement to select one of many code blocks to be executed.
// The switch expression is evaluated once.
// The value of the expression is compared with the values of each case.
// If there is a match, the associated block of code is executed.
// cases shoudl be of type expression.
// if break is not provided then all the cases below it will be executed.
// duplicate cases are not allowed.


import java.util.Scanner;

public class Switches{
    public static void main(String[] args){
        System.out.print("Enter a number between 1 and 7: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please only choose number between 1 and 7");
                break;
        }
    }
}

// Advanced way of using switch.
/*
switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please only choose number between 1 and 7");
*/