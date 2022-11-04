package java.bootcamp.section5;

import java.util.Scanner;
public class BooleanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        boolean checkForInt = input.hasNextInt();

        if (checkForInt) {
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            if (age > 0 && age <= 115) {
                System.out.println(name + "! You are " + age + " years old.");
            } else {
                System.out.println("C'mon you can't be " + age + "years old.");
            }
        } else {
            System.out.println("Invalid type of input given.");
        }
    }
}