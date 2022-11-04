package java.arrays;

// syntax
// data_type[] variable_name = new data_type[size];

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating an array object that will have 5 elements insdie it.
        // LHS is where it is declared in compile time but memory allocation only
        // happens in the run time since RHS is where the object is initialized.
        // and initialized objects are allocated memory at the runtime.
        int[] nums = new int[5];
        String[] str; // decelaration of array. str is defined in the stack memory during the compile time. - Declaration
        str = new String[10]; // actually here object is being created in the heap memory during the run time. - Initializatoin.
//        System.out.println(nums[1]); // 0
//        System.out.println(str[2]); // null
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = input.nextInt();
//        min(nums);
//        max(nums);
//        rangemax(nums, 0, 2);
        int [] numb = {1, 2, 4, 5 ,79};
        reversed(numb);



//        for (int i:nums) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(nums));
    }

    static void arrfunc(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void min(int[] arg){ // this method will check the min valued element in array.
        int min = arg[0];
        for(int i=0;i<arg.length;i++){
            if(min>arg[i]){
                min = arg[i];
            }
        }
        System.out.println(min+" is the smallest element in the array.");
    }

    static void max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max+" is the largest element in the array.");
    }

    static void rangemax(int[] arr, int from, int to){
        int max = arr[0];
        for(int i=from; i<=to; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void reversed(int[] arr){
        for(int i=1; i<arr.length; i++){
            int [] rev_ar = new int[arr.length];

            arr[i] = rev_ar[rev_ar.length-1];
        }

    }


}