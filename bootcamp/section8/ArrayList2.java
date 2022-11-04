package java.bootcamp.section8;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        itemsOfArrayList(numbers);

    }

    public static void itemsOfArrayList(ArrayList<Integer> numbers) {
        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

// type of an ArrayList == ArrayList<Integer> arrayListName