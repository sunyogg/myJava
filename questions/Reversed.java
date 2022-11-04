package myJava.questions;
// 27

// This is how you can remove the last element from the integers in java.
//        int x = 34972938;
//        System.out.println(x/10);

// the concept
// 23597 => 79532
// 0 * 10 + 7 = 7
// 7 * 10 + 9 = 79
// 79 * 10 + 5 = 795
// 795 * 10 + 3 = 7953
// 7953 * 10 + 2 = 79532

public class Reversed {
    public static void main(String[] args) {
        // method 1
//        int num = 23579;
//        while (num > 0) {
//            int x = num % 10;
//            System.out.print(x);
//            num = num / 10;
//        }
        // method 2
        int num = 384728937;
        int res = 0;

        while (num>0){
            int last = num%10;
            res = res*10 + last;
            num = num/10;
        }
        System.out.println(res);
    }
}