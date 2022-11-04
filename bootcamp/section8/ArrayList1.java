package myJava.bootcamp.section8;// ArrayList

import java.util.ArrayList;

public class ArrayList1 {

    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {


        // APPEND
        // adding elements to ArrayList.
        groceryList.add("cheese");
        groceryList.add("potatoes");
        groceryList.add("brush");
        groceryList.add("pen");
        groceryList.add("journal");


        // PRINT
        // printing an ArrayList.
        System.out.println(groceryList);


        // ACCESS
        // Accessing elements of ArrayList.
        System.out.println(groceryList.get(1));


        // INSERT AT INDEX
        // Inserting elements in the ArrayList
        // by specifying the position as index.
        groceryList.add(1, "toiletPapers");


        // DELETE ALL THE ELEMENTS
        // delete all the elements of the ArrayList.
//        groceryList.clear();


        // REMOVE
        // removing an element from an array, either by
        // specifying the object itself or by specifying its index number.
        groceryList.remove(0);
        // if you specify object, then it'll will remove it's first occurrence.
        groceryList.remove("brush");


        // REPLACE
        // replace an item in the ArrayList from another item at specified index.
        groceryList.set(0, "towel");

        // CONTAIN OR NOT
        // to check whether an object is in the ArrayList or not.
        groceryList.contains("brush");


        // INDEX NUMBER OF FIRST OCCURRENCE
        // returns the index number of last occurrence of an object
        // in the ArrayList.
        groceryList.lastIndexOf("journal");


        // INDEX NUMBER
        // returns the index number of an object in the ArrayList.
        groceryList.indexOf("journal");


        // LENGTH
        // return the length of the ArrayList;
        groceryList.size();


        // EMPTY
        // this will return true or false after checking whether the
        // ArrayList is empty or not.
        groceryList.isEmpty();


        // TRIM
        // This will trim the size of the ArrayList to the point where it is
        // completely filled in order to save memory.
//        groceryList.trimToSize();


        // ARRAYLIST TO ARRAY.
        // Converts an ArrayList to an Array.
//        groceryList.toArray();


        // Checks if the another list is is equal to current list or not.
        // for an list to be equal it has to be a list with
        // same elements in same order.
//        groceryList.equals(anotherGroceryList);

    }
}
