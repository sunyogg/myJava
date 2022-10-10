public class While {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Current number is = " + counter);
            counter++;
        }
        System.out.println();

        // the speciality about do while is, the code under do will be executed
        // first then it'll go to while to check the condition.
        // == (execute first then check the condition).
        // so even if the condition is false for the very first time, then also
        // the loop will learn atleast for once, not caring about the condition.

        // example is given below when even the first condition was false, but
        // the loop ran atleast onece.
        counter = 12;
        do {
            System.out.println("Current number is = " + counter);
            counter ++;
        }
        while (counter < 10);
    }
}