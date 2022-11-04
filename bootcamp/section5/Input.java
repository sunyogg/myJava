package java.bootcamp.section5;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int date = input.nextInt();
        input.nextLine();
        System.out.print("Enter Your Name: ");
        String str = input.nextLine();
        int age = 2022 - date;
        System.out.println(str + " you'll be " + age + " years old this year.");
        input.close();
    }
}