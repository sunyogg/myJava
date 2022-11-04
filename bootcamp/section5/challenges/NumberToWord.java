package myJava.bootcamp.section5.challenges;

public class NumberToWord {
    public static void main(String[] args) {
        numberInWord(123);
    }

    public static void numberInWord(int number) {
        int firstDigit = 0;
        while (number > 10) {
            number /= 10;
            firstDigit = number % 10;
            //number -= firstDigit * something;
        }
    }
// after accessing the first letter I don't know how to remove the first letter.
// I know we can do this something like this:
// 234234 => [234234 - (firstDigit * 100000)]
// but I can't find the pattern and ofc I don't want to use the if else statement
// for the range of numbers



    public static String tellInWord(int num) {
        switch (num) {
            case 0 :
                return "Zero";
            case 1 :
                return "One";
            case 2 :
                return "Two";
            case 3 :
                return "Three";
            case 4 :
                return "Four";
            case 5 :
                return "Five";
            case 6 :
                return "Six";
            case 7 :
                return "Seven";
            case 8 :
                return "Eight";
            case 9 :
                return "Nine";
            default :
                return "Invalid";
        }
    }
}