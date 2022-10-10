public class SumOfEvenDigit {
    public static void main(String[] args) {
        System.out.println(sumOfEven(12));
    }

    public static int sumOfEven(int numTillSum) {
        int sumEven = 0;
        for (int i=0; i <= numTillSum; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sumEven += i;
        }
        return sumEven;
    }
}