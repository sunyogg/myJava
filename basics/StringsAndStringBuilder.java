package myJava.basics;
// String pool is a separate memory structure inside the heap memory.
// Why do we need a 'pool'? why can't we simply put it in heap memory.
// pool is something that stores a String when more than one pointer are
// referencing to the same String then those pointers just point at that string pool.
// we have pool so that many reference variable can point to the same String object.

public class StringsAndStringBuilder {
    public static void main(String[] args ) {


        String name1 = "kunal";
        String name2 = "kunal";
        // String are immutable, hence we cannot modify the String object
        // after creating it. Therefore we also cannot use different different
        // reference variable to modify a String since they are simply immutable.
        // Due to security reason we cannot modify String.

        // '==' checks whether two reference variables are pointing
        // at the same object.
        String name3 = "Sunyog";
        String name4 = "Sunyog";
        System.out.println(name3 == name4);


        // we can explicitly tell java to create a new object of same value.
        String name = "Sunyog";
        String nickName = new String("Sunyog");
        System.out.println(name == nickName);

        // and the .equals() compares a String to another String object;
        // and returns true only when each and every sequence of both the String
        // are same also it does care about the reference variable.
        System.out.println(name.equals(nickName));
        System.out.println(name.charAt(0));


    }


}