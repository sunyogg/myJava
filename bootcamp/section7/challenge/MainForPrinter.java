package java.bootcamp.section7.challenge;

public class MainForPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(100, true);
        System.out.println("Remaining toner = " + printer.remainingToner());
        printer.printPaper(5);
        System.out.println("Remaining toner = " + printer.remainingToner());
        System.out.println("Page printed = " + printer.getNumOfPagePrinted());
        printer.printPaper(10);
        printer.printPaper(4);
        printer.printPaper(3);
        printer.printPaper(7);
        System.out.println("Remaining toner = " + printer.remainingToner());
        System.out.println("Page printed = " + printer.getNumOfPagePrinted());
        printer.reFillToner(80);
        printer.reFillToner(80);

    }
}
