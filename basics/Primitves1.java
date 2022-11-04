package java.basics;
// 4

// byte - 1 byte - Stores whole number from -127 to 127
// short - 2 bytes - Stores whole numbers from -32,768 to 32,767
// int - 4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long - 8 bytes - Stores whole numbers from -9,223,372,036,854,775,808 to
//                  9,223,372,036,854,775,807
// float - 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double - 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean - 1 bit - Stores true or false values
// char - 2 bytes - Stores a single character/letter or ASCII values

public class Primitves1{
    public static void main(String[] args){
        byte num = 127;
        System.out.println(num);

        short num1 = 32767;
        System.out.println(num1);

        int num2 =  2147483647;
        System.out.println(num2);

        long num3 = 9223372036854775807L;
        System.out.println(num3);

        float num4 = 234.5434f;
        System.out.println(num4);

        double num5 = 23423.232387482d;
        System.out.println(num5);

        boolean num6 = true;
        System.out.println(num6);

        char num7 = 'S'; // String -> double quote | char -> single quote
        System.out.println(num7);

        double num8 = 2323e2; // scientific number
        System.out.println(num8);

        char num9=65, num10=66; // ASCII values
        System.out.println(num9);
        System.out.println(num10);

    }
}