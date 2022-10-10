
// 34
// what is armstrong number:
// 153 = 1^3 + 5^3 + 3^3
// The sum of cube of all of its digit is equal to the number itself.

// How we use to acces the last digit of a number.
// 153 % 10 = 3
// 153 / 10 = int 15


import java.util.Scanner;

// print all the three digit armstrong number.
public class Armstrongnum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

        for(int i=100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while (n>0){
            int x = n % 10;
            sum += x*x*x;
            n = n/10;
        }
        return  (sum == temp);
    }
}
