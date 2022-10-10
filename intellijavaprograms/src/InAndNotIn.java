public class InAndNotIn{
    public static void main(String[] args){

        int[] nums = {1, 3, 5, 7, 8};
        boolean x = In(nums, 9);
        System.out.println(x);

    }

    static boolean In(int[] arr, int t) {
        int notin = 0;
        for (int i: arr){
            if (i == t){
                return true;
            }
        }
        return false;
    }
}