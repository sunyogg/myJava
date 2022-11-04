package java.bootcamp.section8;

import java.util.ArrayList;

// COPYING AN ARRAYLIST

public class CopyingArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("milk");
        items.add("bread");
        items.add("cheese");
        items.add("cereals");

        // COPYING ITEMS OF AN ARRAYLIST TO ARRAY.
        String[] stringItem = new String[items.size()];
        items.toArray(stringItem);

        // COPYING ITEMS OF ARRAYLIST TO ANOTHER ARRAYLIST.
        ArrayList<String> items1 = new ArrayList<String>(items);

        // COPYING ITEMS OF ARRAYLIST TO ANOTHER ARRAYLIST.
        ArrayList<String> items2 = new ArrayList<String>();
        items2.addAll(items);

    }
}