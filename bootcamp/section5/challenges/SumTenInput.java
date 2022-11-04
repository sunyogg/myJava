package myJava.bootcamp.section5.challenges;

import java.util.Scanner;

public class SumTenInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        int counter = 0;
        while  (counter < 10) {
            boolean isAnInt = input.hasNextInt();// maybe \n is getting passed here
            if (isAnInt) {
                int num = input.nextInt();

                totalSum += num;
                counter += 1;
            } else {
                System.out.println("Invalid data type");
            }
            input.nextLine();// handle end of line (enter key)
            // read the bekaar input given by the user at isAnInt, since the input was
            // bekaar hence it led to the if statement not running and since the if
            // statement didn't run, num variable did not consume the input. Hence
            // input (bekaar) was still saved in the buffer and maybe when the loop
            // restarted it read the input which was already saved in the buffer instead
            // of taking a new input from the user and because of this the loop
            // got stuck in an infinite loop, so to read any bekaar input in each cycle of
            // the loop we place an input.nextLine() to read the bekaar input at the
            // end of the loop.
        }
        input.close();
        System.out.println("The sum of above "+ counter +
                " numbers is " + totalSum);
    }
}
// on line 10 isAnInt is the place where input is getting saved in the buffer.
// whereas in line 12 num is the variable that's consuming that variable.

// Why haven't he put the nextLine() on line 19 instead of line 13?

// if the user was to enter invalid number, the else statement would run and
// print invalid number. However, since the user did enter some content, it would
// need to be read and removed from the scanner before additional content is
// entered. So since the nextLine call handles that by reading the input and not
// storing it, it needs to be after the else statement and not in the if statement.