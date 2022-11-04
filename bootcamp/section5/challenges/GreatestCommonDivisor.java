package java.bootcamp.section5.challenges;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if ((num1 < 0) || (num2 < 0)) {
            return -1;
        }
        int maxForBothNum = 0;
        int maxNumber = checkMax(num1, num2);
        for (int i=1; i <= ((maxNumber)/2); i++ ) {
            if (num1 % i == 0 && num2 % i == 0) {
                maxForBothNum = i;
            }
        }

        return  maxForBothNum;
    }

    public static int checkMax(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        }
        return num1;
    }
}