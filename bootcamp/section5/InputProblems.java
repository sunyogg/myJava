package java.bootcamp.section5;

import java.util.Scanner;

public class InputProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        input.close();


        if (age > 0 && age < 115) {
            System.out.println(name +"!" + " you are " + age + " years old.");
        } else {
            System.out.println("Are you really " + age + "years old?" +
                    "I don't think so.");
        }
    }
}