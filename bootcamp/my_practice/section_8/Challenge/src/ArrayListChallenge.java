
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListChallenge {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int num = input.nextInt();
            input.nextLine();
            switch (num) {
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    printList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4 :
                    removeItem();
                    break;
                case 5 :
                    searchItem();
                    break;
                default :
                    System.out.println("Stopping...");
                    flag = false;
                    break;
            }
        }
    }


    public static void printInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t0 : To Print choice Options. ");
        System.out.println("\t1 : To Print the List of grocery items");
        System.out.println("\t2 : To Add an item to the list. ");
        System.out.println("\t3 : To Modify an item in the list. ");
        System.out.println("\t4 : To Remove an item from the list. ");
        System.out.println("\t5 : To Search for an item in the list. ");
        System.out.println("\t6 : To Quit the application. ");
    }


    public static void printList() {
        int length = groceryList.size();
        System.out.println("Here is the your grocery list: ");
        for (int i=0; i<length; i++) {
            System.out.println("\t-> " + groceryList.get(i));
        }
    }


    public static void addItem() {
        System.out.print("Enter an item: ");
        String item = input.nextLine();
        if (groceryList.contains(item)) {
            System.out.println(item + " is already in the list.");
        } else {
            groceryList.add(item);
        }
    }


    public static void modifyItem() {
        // Replace ?
        System.out.print("Name of the item you want to replace: ");
        String itemToReplace = input.nextLine();
        if (groceryList.contains(itemToReplace)) {
            int itemToReplaceIndex = groceryList.indexOf(itemToReplace);
            System.out.print("Name of the new item: ");
            String newItem = input.nextLine();
            if (groceryList.contains(newItem)) {
                System.out.println(newItem + " is already in the list");
            } else {
                groceryList.set(itemToReplaceIndex, newItem);
            }
        } else {
            System.out.println(itemToReplace + " does not exist in the list.");
        }
    }


    public static void removeItem() {
        System.out.print("Enter the name of the item to remove: ");
        String toRemove = input.nextLine();
        if (groceryList.contains(toRemove)) {
            int toRemoveIndex = groceryList.indexOf(toRemove);
            groceryList.remove(toRemoveIndex);
        } else {
            System.out.println(toRemove + " does not exist in the list");
        }
    }


    public static void searchItem() {
        System.out.print("Enter the name of the item to search: ");
        String toSearch = input.nextLine();
        boolean in = groceryList.contains(toSearch);
        if (in) {
            System.out.println(toSearch + " is in the list at " +
                    (groceryList.indexOf(toSearch) + 1));
        }
        else {
            System.out.println(toSearch + " is not in the list.");
        }
    }
}
