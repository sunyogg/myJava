package java.bootcamp.section5;

public class Try {
    public static void main(String[] args) {
        int num = 1235;
        int targetNum = 0;
        if (num > 100 && num < 999) {
            targetNum = 100;
        } else if (num > 1000 && num < 9999) {
            targetNum = 1000;
        }
        System.out.println(num - targetNum);
    }
}