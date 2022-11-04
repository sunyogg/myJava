package myJava.basics;
//30

/*
    int x; // this is declaring.
    x = 10; // this is initializing.

*/


public class Shadowing{
    static int cls_var = 1; // this will be shadowed at line 9.
    public static void main(String[] args) {
        System.out.println(cls_var); // 1
        int cls_var; // cls_var will be shadowed here.
//        System.out.println(cls_var); scope will begin when value is initialized.
        cls_var = 2;
        System.out.println(cls_var); // 2

        new_func(); // 1
    }

    static void new_func(){
        System.out.println(cls_var);
    }
}