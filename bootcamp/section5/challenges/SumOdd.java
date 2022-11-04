package myJava.bootcamp.section5.challenges;

public class SumOdd {
    public static void main(String[] args) {
//        System.out.println(isOdd(2));
        int result = sumOdd(1, 22);
        System.out.println(result);
    }


    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sumOdd = 0;
        for (int i = start; i <= end; i++) {
            if (!isOdd(i)) {
                continue;
            }
            sumOdd += i;
        }
        return sumOdd;
    }
}