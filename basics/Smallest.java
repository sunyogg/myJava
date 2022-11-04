package java.basics;

public class Smallest {
    public static void main(String[] args){
        int[] nums = {3, 4, 6, 2, 8, 9, 5};
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if (min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}