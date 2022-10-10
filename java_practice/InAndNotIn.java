public class InAndNotIn{
	public static void main(String[] args){

	int[] nums = {1, 3, 5, 7, 8};
	String[] names = {"sunyog", "sanjog", "mindo", "sanju"};
	// boolean x = In(nums, 7);
	boolean x = In(names, "sanjog");
	System.out.println(x);
	}


	static boolean In(int[] arr, int t) {
		for (int i: arr){
			if (i == t){
				return true;
			}
		}
		return false;
	}// ends In method


	static boolean In(String[] arr, String t) {
		for (String i: arr){
			if (i == t){
				return true;
			}
		}
		return false;
	}// ends In method


}





















