public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte byteNumber = 120;
        short shortNumber = 30000;
        int intNumber = 100000;
        long longNumber = 50000 + (10 *
                (byteNumber + shortNumber + intNumber));
        System.out.println(longNumber);
    }
}
