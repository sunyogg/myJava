package java.bootcamp.section5.challenges;

public class CheckForPrime {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            System.out.println((checkForPrimeNumber(i)));
        }
//        for (int i = 100; i>0; i++) {
//            System.out.println(i);
//        }
    }

    public static boolean checkForPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        int counter = 0;
        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }
}


