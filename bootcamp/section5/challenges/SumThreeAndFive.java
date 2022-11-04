package myJava.bootcamp.section5.challenges;

public class SumThreeAndFive {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=0; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count ++;
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}