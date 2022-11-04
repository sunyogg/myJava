package java.basics;
// 17

// Use the for loop when you know how many times the loop is going to run.

/*
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.


for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5). If the
condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block in the loop has been executed.


*/

// range function in java

import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("From: ");
        int tos = input.nextInt();
        System.out.print("To: ");
        int froms = input.nextInt();
        for (int i = tos; i<froms; i++){
            System.out.println(i);
        }
    }
}