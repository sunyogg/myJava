package myJava.bootcamp.section8.challenge;

import java.util.Scanner;

public class Min {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args ) {

        int [] myArray = readNumbers(5);
        System.out.println(findMinimum(myArray));


    }

    private static int[] readNumbers(int num) {
        int[] intArray = new int[num];
        for (int i=0; i<num; i++) {
            intArray[i] = input.nextInt();
            input.nextLine();
        }
        input.close();
        return intArray;
    }

    private static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}