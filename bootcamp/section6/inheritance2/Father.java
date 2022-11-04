package myJava.bootcamp.section6.inheritance2;

public class Father {

    int number;
    double decimal;
    boolean logic;
    String name;

    public Father(int number, double decimal, boolean logic, String name) {
        this.number = number;
        this.decimal = decimal;
        this.logic = logic;
        this.name = name;
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

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public void setLogic(boolean logic) {
        this.logic = logic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Father is doing something.");
    }

    public void jump() {
        System.out.println("Father is jumping.");
    }

    public void eat() {
        System.out.println("Father is eating.");
    }
}

