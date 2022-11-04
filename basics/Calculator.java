package java.basics;
// 22


import java.util.Scanner;

public class Calculator{

    // This method will add x and y.
    static void add(double x, double y){
        System.out.print("The Addition of both the numbers is: ");
        System.out.println(x+y);
    }

    // This method will subtract y from x
    static void sub(double x, double y){
        System.out.print("The Subtraction of both the numbers is: ");
        System.out.println(x-y);
    }

    // This method multiply x with y.
    static void mult(double x, double y){
        System.out.print("The Multiplication of both the numbers is: ");
        System.out.println(x*y);
    }

    // This method will divide x with y.
    static void div(double x, double y){
        System.out.print("The Division of both the numbers is: ");
        System.out.println(x/y);
    }



    public static void main(String[] args){
        System.out.println("CALCULATOR");
        System.out.println("\ta - addition\n\ts - subtraction\n\tm - multiplication\n\td - division");

        while (true){
            // creating an input object
            Scanner input = new Scanner(System.in);
            // taking input on which operation to perform
            System.out.print("Please choose the operation you want to perform: ");
            char decide = input.next().charAt(0);

            if (decide=='q') {
                System.out.println("Program stopped succesfully");
                break;
            }


            // taking input of first value
            System.out.print("Enter the first number: ");
            double x = input.nextDouble();
            // taking input of second value
            System.out.print("Enter the second number: ");
            double y = input.nextDouble();
            // if a then addition
            if (decide=='a'){
                add(x, y);
            }
            // if s then subtraction
            else if (decide=='s'){
                sub(x, y);
            }
            // if m then multiplication
            else if (decide=='m'){
                mult(x, y);
            }
            // if d then division
            else if (decide=='d') {
                div(x, y);
            }
            System.out.print("Do you wanna continue-'y'/'n': ");
            char cont = input.next().charAt(0);
                if (cont=='y'){
                    continue;
                }
                else{
                    System.out.println("Program stopped succesfully");
                    break;
                }
            }
        }
    }