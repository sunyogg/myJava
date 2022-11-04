package java.bootcamp.section7.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("bf50", "NZXT", "240", dimensions);

        Monitor theMonitor = new Monitor("27fpw", "LG", 27,
                new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("zx550", "Asus", 4, 2, "BIOS");

        PC thePc = new PC(theCase, theMonitor, theMotherBoard);

        System.out.println(thePc.getMonitor().getSize());
        System.out.println(thePc.getMonitor().getNativeResolution().getWidth());
        thePc.getTheCase().pressPowerButton();
        thePc.getMonitor().drawPixelAt(1500, 1200, "Red");
        thePc.getMotherBoard().loadProgram("Xcode");


    }
}