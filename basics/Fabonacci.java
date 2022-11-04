package myJava.basics;
//25

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

// 1 2 4 8 16

import java.util.Scanner;

public class Fabonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<n){
           int temp = b;
           b = a + b;
           a = temp;
           count ++;
           System.out.println(a);
       }

    }
}