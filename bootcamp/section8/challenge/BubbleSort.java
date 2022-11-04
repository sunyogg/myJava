package myJava.bootcamp.section8.challenge;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 7, 4, 5, 9, 8, 23, 12, 11, 13, 15, 17, 19, 22, 25};
        int[] sortedArr = bubbleSort(arr);
        binarySearch(sortedArr, 17);

    }


    public static int[] bubbleSort(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    public static void binarySearch(int[] sortedArray, int num) {
        int middleNumber = (int) (sortedArray.length / 2);
        if (num < middleNumber) {
            // check the number between first and the middle number;
            for (int i = 0; i < middleNumber; i++) {
                if (num == sortedArray[i]) {
                    System.out.println("Fount " + num + " at " + i);
                    break;
                }
            }
        }
        else if (num == middleNumber) {
            System.out.println("Found the number " + num + " at " + middleNumber);

        } else {
            // check the number between middle and the last number;
            for (int i = middleNumber; i < sortedArray.length; i++) {
                if (num == sortedArray[i]) {
                    System.out.println("Found " + num + " at " + i);
                    break;
                }
            }
        }
    }
}