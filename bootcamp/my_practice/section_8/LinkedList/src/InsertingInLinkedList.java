import java.util.LinkedList;
import java.util.ListIterator;

public class InsertingInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
    }

    public static boolean add(LinkedList<String> linkedList,
                              String newCity) {

        linkedList.add("Sydney");
        linkedList.add("Melbourne");
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // newCity == cityInList
                return false;
            }
            else if (comparison > 0) {
                // alphabetically smaller. Add before
                stringListIterator.previous();
                linkedList.add(newCity);
                return true;
            }
        }
        linkedList.add(newCity);
        return true;
    }
}