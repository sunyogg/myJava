package myJava.bootcamp.section3;

public class Precedence{
    public static void main(String[] args){
//        System.out.println(12/6*2);
//        System.out.println(12/(6*2));
//        System.out.println(12*6/2);

        double x = 20.00d;
        double y = 80.00d;
        double z = (x + y) * 100.00d;
        double a = z % 40.00d;
        System.out.println("Remainder = " + a);
        boolean cond = (a == 0) ? true : false;
        System.out.println(cond);
        if (!cond){
            System.out.println("Got some remainder");
        }







    }
}