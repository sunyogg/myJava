package java.bootcamp.section6.inheritance2;

public class Child extends Father {

    private char character;

    public Child(int number, double decimal, boolean logic, char character) {
        super(number, decimal, logic, "child");
        // above I have made the name parameter for child as default.
        // It can be used when you know that all the object in child class will
        // a particular parameter common.

        this.character = character;
    }

    // a getter to get character attribute since it's a unique attribute only
    // for child
    public char getCharacter() {
        return character;
    }

    public void jump() {
        System.out.println("Child is jumping.");
        System.out.println("Now i will call the Father.jump() from Child " +
                           "using 'super'.");
        super.jump();
        // this will call the jump method of Parent class. Irrespective of the fact
        // whether jump() is defined in child class or not.

    }
}