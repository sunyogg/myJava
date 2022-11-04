package java.bootcamp.section5.challenges;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(3, 232, 2343));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        int n11 = n1 % 10;
        int n22 = n2 % 10;
        int n33 = n3 % 10;
        if ((n11 == n22) || (n22 == n33) || (n33 == n11)) {
            return true;
        }
        return false;
    }
}