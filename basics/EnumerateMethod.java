package myJava.basics;

public class EnumerateMethod{
	public static void main(String[] args){
		String[] names = {"sunyog" ,"sanjog", "sanju", "mindo"};
		int [] nums = {1, 2, 3, 4, 5, 6};

		enumerate(names);
		System.out.println();
		enumerate(nums);
		
	}

	static void enumerate(String[] arr){
		int count = 0;
		for (String i: arr){
			System.out.println(count+" "+i);
			count += 1;
		}
	}


	static void enumerate(int[] arr){
		int count = 0;
		for (int i: arr){
			System.out.println(count+" "+i);
			count += 1;
		}
	}


}







