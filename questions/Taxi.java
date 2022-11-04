package myJava.questions;

import java.util.Scanner;

public class Taxi{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			String[] condition = new String[t];
			for (int i=0; i<t; i++){
				int x = input.nextInt();
				int y = input.nextInt();
				if (x>y){
					condition[i] = "SECOND";
				}
				else if (x==y){
					condition[i] = "ANY";
				}
				else{
					condition[i] = "FIRST";
				}
			}// closes for loop
			
			for(String i: condition){
				System.out.println(i);
			}

		}// closes main function
	}// closes Taxi class









