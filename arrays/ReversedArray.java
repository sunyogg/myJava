import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args){

//        // method 1 and mine.
//        int[] nums = {1, 2, 3, 4, 5};
//        int [] rev_nums = new int[nums.length];
//        for(int i=nums.length-1; i>=0; i--){
//            // Opposite elements of list like first and last element while coming in between from bothside.
//            // nums[i] = rev_nums[num.length-i]
//            int z = 4-i;
//            rev_nums[z] = nums[i];
//            }
//        System.out.println(Arrays.toString(rev_nums));

        int[] nums = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length - 2 -1]);
        // [1, 2, 3, 4, 5, 6]
        // nums[i] = 1, 2
        // nums[nums.length-i-1] = 6, 5

        // i = o ,

        int z = nums.length/2;
        for(int i=0; i<z; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
//        System.out.println(Arrays.toString(nums));


        }

    }























//public class Try {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int [] rev_arr = {};
//        System.out.println(arr[arr.length-1]);
//        for (int i=1; i<arr.length-1; i++){
//            arr[i] = rev_arr[arr.length-1];
//        }
//    }
//}
