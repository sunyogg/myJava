package myJava.bootcamp.section6.inheritance0;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals("Animal", 1, 1, 5, 7);
        Dogs dogs = new Dogs("Quirky", 1, 1, 5, 6, 2, 32, 3, 4, "Silky long");
//        dogs.eat();
        dogs.walk();
//        dogs.run();
    }
}