package java.bootcamp.section5.challenges;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage(5);
    }

    public static void inputThenPrintSumAndAverage(int times) {
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        for (int i = 0; i < times; i ++ ) {
                int num = input.nextInt();
                totalSum += num;
        }
        System.out.println("Sum of all the number = " + totalSum);
        System.out.println("Average of all the number = " + totalSum/times);
    }
}