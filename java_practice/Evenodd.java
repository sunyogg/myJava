import java.util.Scanner;

public class Evenodd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Even Odd checker...");
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		if (x%2==0) {
			System.out.println(x+" is even.");
		}
		else {
			System.out.println(x+" is odd.");
		}
	}
}