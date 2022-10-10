public class Methods {
    public static void main(String[] args) {
        int score1 = calculateScore(true, 800, 5, 100);
        int score2 = calculateScore(false, 10000, 8, 200);

        System.out.println(score1);
        System.out.println(score2);
    }

    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus){
        int finalScore;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
//         you don't really need to use the else statement here since the if
//         statement will only be triggered if it is true and if 'if' statement
//         gets triggered then it'll return something and the code below it
//         won't run.
        return -1;
    }
}