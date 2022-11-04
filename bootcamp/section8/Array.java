package java.bootcamp.section8;

import java.util.Scanner;

public class Array {


    public static void main(String[] args) {


//        int[] myIntArray = new int[3];
//        myIntArray[0] = 1;
//        myIntArray[1] = 2;
//        myIntArray[2] = 3;
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[2]);



//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(2);
//        System.out.println(5);
//        printArray(myIntArray);



//        int[] myIntArray = new int[20];
//        for (int i=0; i<myIntArray.length; i++) {
//            myIntArray[i] = i*i;
//        }
//        printArray(myIntArray);


 


        int[] myIntArray = inputInArray();
        printArray(myIntArray);
        System.out.println(getAverageOfArray(myIntArray));



















    }

    public static int[] inputInArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int howManyElements = input.nextInt();
        int[] myArray =new int[howManyElements];
        for (int i=0; i<myArray.length; i++){
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

    public static double getAverageOfArray(int[] array) {
        double sum = 0.00;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return  (sum / array.length);
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}