package myJava.basics;
// 21

// mymethod() is the name of the method.

// static means that the method belongs to the Main class and not an object of
// the Maind class. You will learn more about objects and how to access methods
// through objects later in this tutorial.

// void means that this method does not have a return value. You will learn more
// about return values later in this chapter

/*
access_modifier return_type name(){
    // method body
}
*/


public class Methods{

    // defining a method
    static void my_method() {
        // This method will print a messge.
        System.out.println("I-the method-just got executed.");
    }

    static void my_name(String fname){
        // This method will print the string parameter in upper case.
        System.out.println(fname.toUpperCase());
    }

    static int Add(int x, int y){
        // This method will add 2 numbers.
        // This function will return an integer value, hence we haven't used void.
        int z = x + y;
        return (z);
    }

    // using if else statement inside a method.
    static void check_age(int age){
        if (age<18){
            System.out.println("Since you are below 18, Access denied.");
        } else{
            System.out.println("Access granted.");
        }
    }


    // defining the main method, where the execution starts
    public static void main(String[] args){
        // calling the method.
        my_name("sunyog");
        my_name("Carl Jhonson");

        int result = (Add(34, 67));
        System.out.println(result);

        check_age(26);
    }
}