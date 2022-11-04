package java.bootcamp.section8.challenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 5, 3, 9};
        int[] reversedArray = betterReversedArray(myArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i=1; i<=(arr.length); i++) {
            reversedArray[i-1] = arr[arr.length - i ];
        }
        return reversedArray;
    }

    private static int[] betterReversedArray(int[] arr) {
        int maxIndex = arr.length - 1;
        int halfLength = arr.length /2 ;
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}