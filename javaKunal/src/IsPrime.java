
//33

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        isprime(n);
    }

    static void isprime(int m){
        double sqr = Math.sqrt(m);
        int sqrt  = (int) (sqr);
        for (int i=2; i<=sqrt; i++ ){
            if (m%i == 0){
                System.out.println("Not a prime number");
            }else{
                System.out.println("Prime number");
            }
            break;
        }
    }
}
