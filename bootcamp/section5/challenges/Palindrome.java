package myJava.bootcamp.section5.challenges;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            number /= 10;
        }
        if (reverseNumber == originalNumber) {
            return true;
        }
        return false;
    }

}