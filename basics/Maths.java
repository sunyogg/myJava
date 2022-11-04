package myJava.basics;

// 12
// Math module.

public class Maths{
    public static void main(String[] args){
        int x = Math.max(2, 4);
        int y = Math.min(0, 8);
        double z = Math.sqrt(64);
        double a = Math.floor(9.98342);
        int b = Math.getExponent(78798);
        int c = Math.abs(-23);
        double d = (Math.random() * 101);
            int e = (int) d;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println((b));
        System.out.println(c);
        System.out.println(e);



    }
}