public class Main {
    public static void main(String[] args) {
        Father father = new Father(7, 28.76, true, "father");
        Child child = new Child(5, 20.026, false, 'A');


        // I can use the getters of parent to get the attributes of child
        System.out.println();
        System.out.println("Using Father's getters() to get " +
                           "attributes of Child.");
        System.out.println("father's logic = " + father.getLogic());
        System.out.println("child's name = " + child.getName());
        System.out.println("child's number = " + child.getNumber());


        // Principal of Overriding
        System.out.println();
        System.out.println("We have overridden the jump() of Father in Child " +
                ", so if we call jump() for Father,\njump which is defined in " +
                "father will be called but if we call the jump() for child " +
                "\nthen jump() defined in Child will be called. ");
        father.jump();
        child.jump();
        System.out.println();
        System.out.println("But we haven't defined eat() for Child, so it'll " +
                           "call the eat() of Father.");
        father.eat();
        child.eat();


        System.out.println();
//        father.getCharacter();
        System.out.println(child.getCharacter());



    }
}