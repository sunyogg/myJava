import java.util.Scanner;
import java.util.Arrays;

public class ReviseCal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int operation;
		double num1;
		double num2;
		System.out.println("\nCalculator in Terminal");
		System.out.println("\n\t1 - Addition\n\t2 - Subtraction \n\t3 - Multiplication\n\t4 - Division\n\t5 - quit");
		while (true){
			System.out.print("\nEnter operation: ");
			operation = input.nextInt();

			if (operation == 5){
				break;
			}

			if (operation!= 1 && operation!= 2&& operation!= 3 && operation!= 4){
				// 'or' me ek hi condition dekhta hai, 'and' me saari condition dekhta hai.
				System.out.println("Invalid operation requested.");
				continue;
			}

			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();

			if (operation == 1){
				sum(num1, num2);
			}
			else if (operation == 2){
				sub(num1, num2);
			}
			else if (operation == 3){
				mult(num1, num2);
			}
			else if (operation == 4){
				div(num1, num2);
			}
			
		} // ends while loop
		
		
	} // ends main()
	
	static void sum(double num1, double num2){
		// this method will add 2 numbers.
		double result = num1 + num2;
		System.out.println(result);
	}
	static void sub(double num1, double num2){
		// this method will subtract 2 numbers.
		double result = num1 - num2;
		System.out.println(result);
	}
	static void mult(double num1, double num2){
		// this method will multiply 2 numbers.
		double result = num1 * num2;
		System.out.println(result);
	}
	static void div(double num1, double num2){
		// this method will divide 2 numbers.
		double result = num1 / num2;
		System.out.println(result);
	}
	
} // ends class






















