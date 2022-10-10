
import java.util.Scanner;

public class intInputProblem{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int integer = input.nextInt();
		String string = input.next();
		System.out.println("integer: "+integer);
		System.out.println("string: "+string);
	}
}