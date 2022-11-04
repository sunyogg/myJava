package java.basics;
// 18

// Looping through Iterables in java.

// for (String i : iterable){
    // body
//      }


public class ForEach{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        for (int i : nums){
            System.out.println(i);
        }

        System.out.println();

        String[] names = {"Sunyog", "Suyog", "Pratik", "Prasoon"};
        for (String i : names) {
            System.out.println(i.toUpperCase());
        }
    }
}