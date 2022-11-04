package myJava.bootcamp.section5.challenges;

public class EvenOrOdd {
    public static void main(String[] args) {
        int counter = 0;
        int countForEven = 0;
        while (counter < 20) {
            counter ++;
            if (!isEvenNumber(counter)) {
                continue;
            }
            System.out.println("Even number is = " + counter);
            countForEven++;
            if (countForEven == 5) {
                break;
            }
        }
        System.out.println("Total Even number found = " + countForEven);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

// false condition ko pehle lekar loop me continue ka use kare taaki jo operation
// tumhe condition ke true hone me karne the, wahan tak jana hi na pade, isse
// thodi bhott memory to zarur bachegi.