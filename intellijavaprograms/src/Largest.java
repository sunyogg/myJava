
// 23
// Q1
// find the largest number out of the tree numbers

import java.util.Scanner;

public class Largest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a+" is greater.");
            }else{
                System.out.println(c+" is greater.");
            }

        }else{
            if (b>c){
                System.out.println(b+" is greater.");
            }else{
                System.out.println(c+" is greater.");
            }
        }

    }
}