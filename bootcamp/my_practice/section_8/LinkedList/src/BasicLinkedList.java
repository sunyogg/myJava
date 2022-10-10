
import java.util.Iterator;
import java.util.LinkedList;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Darwin");

        System.out.println(placesToVisit);


        // Each container/placeHolder in a linked list contains the object itself
        // and the pointed/reference to the next object.

        // so container containing Sydney also contains a reference to Melbourne.
        // container containing Adelaide also contains a pointer to Perth.

        printList(placesToVisit);
        placesToVisit.add(1, "Alice Springs");
        System.out.println();
        printList(placesToVisit);

        // Now since we have inserted an object/element in between instead of
        // moving all the objects on container below to create space to insert
        // the given object like it happens in Arrays and ArrayList, what it does,
        // is that it changes the reference to save resources and optimize code.
        // so now since "Alice Springs" was added between "Sydney" and "Melbourne"
        // "Sydney" container will have "Sydney" object, but it'll contain the
        // REFERENCE to "Alice Springs" instead of "Melbourne" and "Alice Spring"
        // container will contain reference to "Melbourne". Rest all will be same
        // i.e "Melbourne" will still point to "Adelaide". So here instead of
        // changing the whole arrangement like in ArrayList or Arrays, we are only
        // changing the reference of 1 object.


    }
    public static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}