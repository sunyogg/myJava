import java.util.Arrays;

public class ReferencesToArray {
    public static void main(String[] args) {
        int myInt = 6;
        int myAnotherInt = myInt;
        System.out.println("myInt = " + myInt);
        System.out.println("myAnotherInt = " + myAnotherInt);
        myAnotherInt = 7;
        System.out.println("myInt = " + myInt);
        System.out.println("myAnotherInt = " + myAnotherInt);
        myAnotherInt = myInt;
        modifyInt(myAnotherInt);
        System.out.println("myInt = " + myInt);
        System.out.println("myAnotherInt = " + myAnotherInt);


        int[] myIntArray = new int[5];
        int[] myAnotherIntArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));
        myAnotherIntArray[0] =  5;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));
        modifyArray(myAnotherIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myAnotherIntArray = " + Arrays.toString(myAnotherIntArray));

    }

    public static void modifyInt(int num) {
        num = 5;
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 69;
    }
}
