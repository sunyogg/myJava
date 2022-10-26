

// 26

import java.util.Scanner;

public class Occurence{
    public static void main(String[] args){
        // method 1
//        int[] nums = {1, 3, 8, 5, 7, 5, 7, 8, 7, 9};
//        int count=0;
//        for (int i : nums){
//            if (i==7){
//                count++;
//            }
//        }
//        System.out.println(count);

        // method 2
        int n = 1223746784 ;
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == 7){
                count ++;
            }
            n = n/10;
        }
        System.out.println(count);

        // This is how you can remove the last element from the integers in java.
        int x = 34972938;
        System.out.println(x/10);



    }
}