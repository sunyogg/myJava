import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4, 6, 7};
        int index = 3;
        int [] removed = new int[nums.length-1];
        for (int i=0; i<nums.length-1; i++){

//            System.out.println(nums[i+1] +" "+ nums[i++]);
            if (i == index){
                removed[i] = nums[i+1];
            }else{
                removed[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(removed));
    }
}
