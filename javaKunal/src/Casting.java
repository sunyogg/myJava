
// 5

// Java type casting.
        /*
        WIDENING CASTING (AUTOMATIC)
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        NARROWING CASTING (MANUAL)
        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */


public class Casting{
    public static void main(String[] args){
        // Automatic casting. From down to up. Widening
        int num = 12;
        float new_num = num;
        System.out.println(num);
        System.out.println(new_num);



        // Manual Casting. From up to down. Narrowing.
        float num1 = 12.3434f;
        int new_num1 = (int) num1;
        System.out.println(num1);
        System.out.println(new_num1);




        // automatic type promotion in expressions in java.
        int a = 256;
        byte b = (byte) a;
        System.out.println(b); // result: 257 % 256  = 1 | since byte can only store from -128 to 127.

        byte x = 100;
        byte y = 20;
        int c = x * y;
        System.out.println(c);
        // when 100 * 20 and result was way more than what a byte can store. Hence,
        // automatically converted the byte to int.
        // or maybe it's not about the result being more than what byte can store.
        // so it just converts it everytime whenever we perform any operation on byte.


    }
}