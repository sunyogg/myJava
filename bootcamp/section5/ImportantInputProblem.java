package myJava.bootcamp.section5;

import java.util.Scanner;

public class ImportantInputProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number);
//        input.nextLine();
        System.out.print("Enter a string: ");
        String name = input.nextLine();
        System.out.println(name);
    }
}

// let's talk about what does nextInt() takes:
// so if you are giving 20 as input what you are doing
// typing 20 and then pressing enter.
// in other words: 20\n
// but the nextInt() will only take 20 from the input and leave \n in the buffer.
// now when we move on to the next line where we are using nextLine() to take
// a input String. So the work of the nextLine() to
// take everything as input before the \n character.
// but since the /n character is already in the buffer so it takes everything
// before it as input, which means it takes nothing as input.
// so in order to prevent this, we will need to consume that \n before taking
// any nextLine() input, so what we can do is use nextLine() and not store it in
// any variable, so it'll consume the \n due the integer and we can type the string.

// nextInt() will always leave a \n behind by not taking it. so if you are again
// taking nextInt() then there is no problem but if you are taking any other
// datatype like String, boolean then you have to make sure that just after nextInt()
// there is empty nextLine() to consume that \n.

//  hasNextInt verifies that the user has inputted an int rather than, say,
//  a String. nextInt reads the inputted int from the buffer.
// hasNextInt gets the input into buffer and returns boolean and
// nextInt gets the number from the buffer.
// A Buffer is a portion in the memory that is used to store a stream of data from
// peripheral devices. Then from this buffer this stream of data is collected and
// stored in variables. A stream can be defined as a continuous flow of data.
// The buffer is quite useful as Java deals everything as a String.