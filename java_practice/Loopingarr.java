
public class Loopingarr{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6};

		// using a normal for loop.
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		// using a for-each loop.
		for (int i: arr){
		System.out.print(i+" ");
		}
		
	}
}