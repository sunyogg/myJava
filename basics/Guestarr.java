package myJava.basics;

public class Guestarr{

	static void print_arr(String[] arr){
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}//closes print_arr method. 
	
	public static void main(String[] args){
		String[] guests = {"rohan", "mohan", "sohan", "gohan"};
		System.out.println("\nThis is the guest list for the party: ");
		print_arr(guests);
		System.out.println("\nWe just got info that Gohan can't come to the party.");
		guests[3] = "Rohit";
		System.out.println("\nHere is the new list: ");
		print_arr(guests);
		System.out.print("Good new! We just got a new and bigger table. ");
		System.out.println("Now we can invite more people.");
	}// closes main function

}// closes public class