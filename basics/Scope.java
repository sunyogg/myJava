package java.basics;// 29

public class Scope{
    public static void main(String[] args){
        int a = 73; // initialized outside the block
        int b = 24;

        // a new block of code.

        // anything that is initialized outside the block, can be used inside the
        // block but anything that is initizalized inside the block cannot be used
        // outside the block.

        // anything that is initialized outside the block, cannot be initialized
        // again inside the block but anything initialized inside the block can be
        // initiazliad outside the block again.
        {
            int c = 56;
            b = 36;
            //int a = 38; // already initialized outside the block in the same method
                          // hence you cannot initialize again.
                          // but you can modify the value.

            System.out.println(a); // defining a new variable inside a scope.
            // value initialized in this block will remain in this block.
        }

        // System.out.println(c); // we cannot access that variable outside the block.
        System.out.println(b);


    }
}