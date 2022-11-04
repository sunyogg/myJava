package java.basics;
// nextLine() : next line me jana hi padega input dene ke liye.
// nextInt() : ussi line me space ke baad ya next line me input de sakte hain.
// next() : ussi line me space ke baad ya next line me input de sakte hain.


import java.util.Scanner;
public class intInputProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int integer = input.nextInt();
        String string1 = input.nextLine();
        String string = input.nextLine();

//        System.out.println("age: "+integer);
        System.out.println("fname: "+string1);
        System.out.println("lname: "+string);

    }
}
