

// 14

// Use the while loop when you don't know how many times the loop is going to run.


import java.util.Scanner;

public class While{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while (count < num){
            System.out.println(count);
            count ++ ;
        }
    }
}