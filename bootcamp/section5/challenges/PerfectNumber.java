package myJava.bootcamp.section5.challenges;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int i=1; i<= 10000; i++) {
            if (givePerfectNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean givePerfectNumber(int num) {
        if (num < 1) {
            return false;
        }
        int perfectSum = 0;
        for (int i=1; i<=num/2; i++) {
            if (num % i == 0) {
                perfectSum += i;
            }
        }
        if (perfectSum == num) {
            return true;
        }
        return false;
    }
}