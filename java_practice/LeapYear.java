
import java.util.Scanner;

// conditions for a leap year.
// not divided by 4 == not leap.
// divided by 4, not divided by 100 == leap
// dividid by 4, divided by 100 , divided by 400 == leap
// divided by 4, diveded by 100, not divided by 400 == not leap



public class LeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					System.out.println(year+" is a leap year.");
				}else{// not divided by 400
					System.out.println(year+" is not a leap year.");
				}
			}else{// not divided by 100
				System.out.println(year+" is a leap year.");
			}
		}else{// not divided by 4
			System.out.println(year+" is not a leap year.");
		}
	}
}