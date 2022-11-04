package myJava.basics;
// 32

// to achieve method overloading we can name two method of same name but one of
// the two condition has to be followed inorder to for method overloading to work.
// 1) The type of argument should be differnt (String, int, char, double, etc)
// 2) Or the number of parameter taken by the funcion of same should be different.
//    so if first method is taking 1 parameter then second method should take more than 1.
// method call cannot be empty when you are calling a method that does method overloading.
public class MethodOverloading {
    public static void main(String[] args) {
        func(27);
        func("Sunyog");
    }

    static void func(int num){
        System.out.println(num);
    }

    static void func(String name){
        System.out.println(name);
    }
}
