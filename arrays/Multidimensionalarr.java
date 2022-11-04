package java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensionalarr {
    public static void main(String[] args) {
        // initializing a multidimensional array.
        Scanner input = new Scanner(System.in);

        int [][] arr = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        // number of rows = marr.length
        // number of column = marr[rows].length
        int [][] marr = new int[3][4];
        for(int row=0; row<marr.length;row++){
            for(int col=0; col<marr[row].length; col++){
                marr[row][col] = input.nextInt();

            }
        }
        printarr(marr);



//        System.out.println(arr[0][1]+"\n");
//        printarr(arr);
    }

    static void printarr(int[][] arr){
        // accessing the elements of multidimensional array.
        for(int i=0; i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
