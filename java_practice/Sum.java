
import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		System.out.print("Enter another number: ");
		int y = input.nextInt();
		System.out.println("sum: "+ (x+y));
	}
}