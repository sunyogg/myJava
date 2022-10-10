import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(resizeArray(myArr, 3)));

    }

    // this method will increase the slots of an array, and also slice it.
    public static int[] resizeArray(int[] arr, int newSize) {
        if (newSize < arr.length) {
           // we will slice the array.
            int[] resizedArray = new int[newSize];
            for (int i = 0; i<resizedArray.length; i++) {
                resizedArray[i] = arr[i];
            }
            return resizedArray;
        } else {
            int[] resizedArray = new int[newSize];
            for (int i=0; i<arr.length; i++) {
                resizedArray[i] = arr[i];
            }
            return resizedArray;
        }
    }
}

