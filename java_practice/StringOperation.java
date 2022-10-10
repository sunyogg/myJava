
import java.util.Scanner;

public class StringOperation{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the string: ");
		int t = input.nextInt();
		int[] nums = new int[t];
		System.out.println("Okay Enter "+t+" integers below: ");
		for (int i=0; i<t; i++) {
			int n = input.nextInt();
			nums[i] = n;

		} // ends for loop;

		System.out.print("Enter the number that you want to find: ");
		int s = input.nextInt();
		int count = 0;
		int wrongs = 0;
		for (int e: nums){
			
			if ( e == s){
				System.out.println(s+" is present in Array at index "+count);
				break;
			}
			else {
				wrongs +=1;
			}
			count += 1;
		}// ends for loop
		if (wrongs == nums.length){
			System.out.println(s+" is not present in Array.");
		}
	}
}










