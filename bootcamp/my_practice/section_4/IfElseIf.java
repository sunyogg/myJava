public class IfElseIf{
    public static void main(String[] args) {
        int score = 3000;
        boolean gameOver = true;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("You scored 5000.");
        }
        else if (score > 1000 && score < 5000) {
            System.out.println("You scored more than 1000 but less than 5000.");
        }
        else {
            System.out.println("You scored less than 1000.");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score was " + score);
        }
        // you cannot use the variable finalScore outside the codeblock
        // because it was created outside  the codeblock.
        // because after getting out of the codeblock java will delete any variable
        // created inside the codeblock.
//        int nextScore = finalScore;

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score is " + finalScore);
        }
    }
}