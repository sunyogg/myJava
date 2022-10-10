import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 2, 5, 3, 7, 3, 6};
        giveSortedArray(array);
    }

    public static void giveSortedArray(int[] arr) {
        int[] sortedArray = new int[arr.length];
        for (int i=0; i<sortedArray.length; i++) {
            sortedArray[i] = giveMax(arr);
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int giveMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        array[index] = 0;
        return max;
    }
}