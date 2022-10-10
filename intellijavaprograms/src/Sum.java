
// 7

import java.util.Scanner;

//public class Sum{
//    public static void main(String)
//}

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt(); // does taking input adds a new line?
        System.out.print("Enter another number: ");
        int y = input.nextInt();
        System.out.print("The sum of both number is: ");
        System.out.println(x+y);
    }
}