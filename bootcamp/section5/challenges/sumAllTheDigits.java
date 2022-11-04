package java.bootcamp.section5.challenges;

public class sumAllTheDigits {
    public static void main(String[] args) {
//        System.out.println(sumDigits(-2));
        System.out.println(sumFirstAndLastDigit(4));
    }

    public static int sumDigits(int num) {
        if (num < 0) {
            return -1;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
//            System.out.println(num);
        }
        return sum;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 10) {
            return num + num;
        }
        int lastDigit = (num - ((num / 10) * 10));
        int firstDigit = 0;
        while (num > 10) {
            num /= 10;
            firstDigit = num % 10;
        }
        return firstDigit + lastDigit;
    }
}

// to get the least significant digit.
// 125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125-120 = 5

// to get the LAST DIGIT
// 1234 -> 1234 % 10 => 4

// to get the FIRST DIGIT if number is more than 10
// num = 1234
// firstDigit = 0;
// while (num > 10 ) {
//     num /= 10;
//     firstDigit = num % 10;
// }