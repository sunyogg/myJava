package java.bootcamp.section8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAndCursorMovement {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Darwin");

        System.out.println(placesToVisit);


// [Sydney, Melbourne, Adelaide, Perth, Canberra, Darwin]
        Iterator<String> i = placesToVisit.iterator();
//         HERE WE ARE TALKING ABOUT THE CURSOR.


// ---->>         // WORK            // CURSOR LOCATION
                  //                  : BEFORE Sydney
        i.next(); // RETURN Sydney    : BETWEEN Sydney AND Melbourne
        i.next(); // RETURN Melbourne : BETWEEN Melbourne AND Adelaide
        i.next(); // RETURN Adelaide  : BETWEEN Adelaide AND Perth
        i.next(); // RETURN Perth     : BETWEEN Perth AND Canberra
        i.next(); // RETURN Canberra  : BETWEEN Canberra AND Darwin
        i.next(); // RETURN Darwin    : AFTER Darwin
        i.next(); // Should THROW ERROR, SINCE NOTHING IS AFTER DARWIN.

        System.out.println(i.hasNext()); // false

    }
}
