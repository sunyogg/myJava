
import java.util.ArrayList;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // We can only class as types in an array list.

        ArrayList<String> strArrayList = new ArrayList<String>();

        Integer intVal = Integer.valueOf(45); // here 45 is instance of Integer
        intVal.intValue(); // here 45 is of primitive type int.

        // And we cannot use primitive types in an ArrayList.
        // ArrayList<int> intArrayList = new ArrayList<int>();

        // So in order to use primitive types in an ArrayList we use concepts
        // AUTOBOXING and UNBOXING.

        // JAVA has provided us with Classes of these primitive types to use.
        Integer intOfClass = Integer.valueOf(45);
        Integer integer = Integer.valueOf(34);
        Double dbll = Double.valueOf(45.234);

        // We can instead use these class types in our ArrayList.
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // AUTOBOXING
        }
        System.out.println(intArrayList);

        for (int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }


        // JAVA behind the scene is converting the shortcut to proper commands
        // in compile time.
        Integer yourInt = 56; // ==> Integer yourInt = Integer.valueOf(56);
        int myInt = yourInt; // ==> int myInt = yourInt.intValue();

        ArrayList<Double> dblArrayList = new ArrayList<Double>();
        for (double dbl=0; dbl<=10.00; dbl+= 0.5 ) {
            dblArrayList.add(Double.valueOf(dbl)); // AUTOBOXING
        }

        for (int i=0; i<dblArrayList.size(); i++) {
            double value = dblArrayList.get(i).doubleValue(); // UNBOXING
            System.out.println(i + " --> " + value );
        }


    }
}

// Integer.valueOf(45); --> 45 here is now an instance of the class Integer.
// AUTOBOXING : Converting the int type primitive value to Integer class instance.
// Returns an Integer instance representing the specified int value.



// CONVERTING A PRIMITIVE TYPE TO CLASS TYPE (LET'S SAY INTEGER)

// AUTOBOXING
// Converting the int type to class type Integer.
// Integer myInt = Integer.valueOf(45);

// UNBOXING
// Converting the class type Integer to primitive type int.
// int myNewInt = myInt.intValue();

