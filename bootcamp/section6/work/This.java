
package java.bootcamp.section6.work;

class This{

    private int number;
    private double decimal;
    private boolean logic;
    private String name;

    public This(int number, double decimal, boolean logic, String name) {
        this.number = number;
        this.decimal = decimal;
        this.logic = logic;
        this.name = name;
    }

    public This(boolean logic, String name) {
        this(7, 4.2382, logic, name);
    }

    public This() {
        this(true, "Hello");
    }

    public int getNumber() {
        return number;
    }

    public double getDecimal() {
        return decimal;
    }

    public boolean getLogic() {
        return logic;
    }

    public String getName() {
        return name;
    }
}

