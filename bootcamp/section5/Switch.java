package java.bootcamp.section5;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 5;
        switch (2) {
            case 1:
                System.out.println("The value is 1.");
            case 2:
                System.out.println("The value is 2.");
            case  3:
                System.out.println("The value is 3.");
            case 4: case 5: case 6:
                System.out.println("The value is either 4 or 5 or 6.");
            default :
                System.out.println("The value is neither 1 nor 2 or 3.");
        }
        // it'll continue to execute all the cases below the first case
        // that was true.
        // so here since the case 2 executes to be true and hence all
        // the cases below it (case 3, default) will also execute
        // use the 'break' keyword to prevent this feature.
    }
}