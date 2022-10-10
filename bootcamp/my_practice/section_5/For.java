
public class For {
    public static void main(String[] args) {
//        System.out.println(calcInterestRate(23123, 4));
//        System.out.println(calcInterestRate(23123, 5));
//        System.out.println(calcInterestRate(23123, 6));
//        System.out.println(calcInterestRate(23123, 7));
//        System.out.println();
//
//        for (int i=4; i<=7; i++) {
//            System.out.println(String.format("%.3f", calcInterestRate(23123, i)));
//        }
//        System.out.println();
//
//        for (int i=5; i>=1; i--) {
//            System.out.println(String.format("%.3f", calcInterestRate(23123, i)));
//        }


        String result = checkForPrimeNumber(6);
        System.out.println(result);

    }

    public static double calcInterestRate(double amount, double interestRate) {
        return ((amount) * (interestRate/100));
    }

    public static String checkForPrimeNumber(int number) {
        int counter = 0;
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }
        if (counter > 0) {
            return "Not Prime";
        }
        else {
            return "Prime";
        }
    }
}
