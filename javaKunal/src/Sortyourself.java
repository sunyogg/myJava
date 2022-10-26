import java.util.Arrays;
public class Sortyourself{
    public static void main(String[] args){
        int[] nums = {9, 4, 1, 8, 3, 7, 6, 2, 5};
        for (int i=0; i<nums.length; i++){
            if (nums[i]<4){
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}