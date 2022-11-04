package java.bootcamp.section7.composition;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC (Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        // this will return the object of the class Case.
        // then we can call any method of class Case using this object.
        return this.theCase;
    }

    public Monitor getMonitor() {
        // this will return the object of the class Monitor.
        // then we can call any method of class Monitor using this object.
        return this.monitor;
    }

    public MotherBoard getMotherBoard() {
        // this will return the object of the class MotherBoard.
        // then we can call any method of class MotherBoard using this object.
        return this.motherBoard;
    }
}

