package myJava.bootcamp.section7.challenge;

public class Printer {
    private int tonerLevel = 100;
    private int numOfPagePrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel < 100 && tonerLevel > 0) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void printPaper(int pages) {
        int pagesToPrint = pages;
        if (isDuplexPrinter) {
            pagesToPrint = ((pagesToPrint/2) + (pagesToPrint % 2));
            tonerLevel -= 10;
        }
        this.numOfPagePrinted += pagesToPrint;
        tonerLevel -= 5;



        if (tonerLevel <= 0) {
            System.out.println("Cannot print. Please refill the toner.");
        }
    }

    public int remainingToner() {
        return this.tonerLevel;
    }

    public int getNumOfPagePrinted() {
        return numOfPagePrinted;
    }

    public void reFillToner(int amount) {
        if (amount + this.tonerLevel < 100 && amount > 0) {
            this.tonerLevel = amount;
            System.out.println("Filled toner till "  + this.tonerLevel + "%.");
        } else if (amount + this.tonerLevel > 100) {
            System.out.println("You'll overfill the toner. Please choose " +
                    "correct amount.");
        }
    }
}