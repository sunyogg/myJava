public class AllFactors {
    public static void main(String[] args) {
        printAllFactor(12);
    }

    public static void printAllFactor(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}