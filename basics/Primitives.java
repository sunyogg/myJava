package java.basics;
// 3

// a primitve is a type which cannot be further divided or simplified or broken.

// type variableName = value;

public class Primitives{
    public static void main(String[] args){
        int a = 12;
        System.out.println(a);

        float b = 12.222f;
        System.out.println(b);

        char c = 'z';
        System.out.println(c);

        boolean d = true;
        System.out.println(d);

        String e = "a string"; // string is not a primitive data type in java.
        System.out.println(e);

        int f;
        f = 69;
        f = 79; // f instead of pointing to 69 is now pointing to 79.
        System.out.println(f);

        // if you don't want you or anyone to assign any new value to the variable.
        // then use the final or constant keyword.
        final int g = 696969;
        //g = 89; // this will throw an error.
        System.out.println(g);


        // Display variable.
        System.out.print(g + f);
        System.out.println(e + f);
        System.out.println(c + e);



        // Declare multiple variable

        // instead of writing this
        /*
        int p = 3;
        int q = 2;
        int r = 1;
        */
        // we can write
        int p = 3, q = 2, r = 1;

        // one value to multiple variable
        int x, y, z;
        x = y = z = 9;

    }
}