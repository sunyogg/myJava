package myJava.bootcamp.section7.polymorphism;

public class Main {
    public static void main(String[] args) {

        for (int i = 0 ; i < 20; i++) {
            Movie movie = getRandomMovie();
            System.out.println(movie.getName() + "\n" + movie.plot() + "\n" );
        }

    }

    public static Movie getRandomMovie() {
        int randomNumber = (int) ((Math.random() * 4) + 1);
        switch (randomNumber) {
            case 1 :
                return new Jaws();
            case 2 :
                return new IndependenceDay();
            case 3 :
                return new ThreeIdiots();
            case 4 :
                return new ForgettableMovie();
            default :
                return null;
        }
    }
}
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return ("A Shark eats lot of people.");
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens try to conquer planet Earth";
    }
}

class ThreeIdiots extends Movie{
    public ThreeIdiots() {
        super("3 Idiots");
    }

    @Override
    public String plot() {
        return "Story of 3 college friends, dealing with everyday problem";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }

    // no plot here.
}

