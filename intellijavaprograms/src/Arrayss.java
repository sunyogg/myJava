
// 20

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args){
        // this is how you can print arrays;
        int[] nums = {1, 2, 3, 4, 5, 5, 6};
        System.out.println(java.util.Arrays.toString(nums));
//        String[] names = {"John", "Clemente", "Ostrich", "Michael", "Carl"};
//
//        // Accessing the elements of an array.
//        System.out.println(names[0]);
//
//        // modifying the elements of an array.
//        names[0] = "Franklin";
//        System.out.println(names[0]);
//
//        // accessing the length of an array.
//        System.out.println(names.length);
//        System.out.println("");
//
//        // using a simple for loop on an array
//
//        for (int i = 0; i<names.length;i++ ){
//            System.out.println(names[i]);
//        }
//
//        System.out.println("");
        
//        // using a for-each loop on an array.
//        for (String i:names){
//            System.out.println(i);
//        }
        // Mutlidimensional Array -> Nested Array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        // looping through a nested list.
        for (int i=0; i<arr.length; i++){
            for (int s=0; s<arr[i].length; s++){
                System.out.println(arr[i][s]);
            }
        }
    }
}
