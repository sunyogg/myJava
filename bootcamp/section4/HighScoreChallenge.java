package java.bootcamp.section4;

public class HighScoreChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Dan", 1500);
        displayHighScorePosition("San", 1000);
        displayHighScorePosition("Bam", 400);
        displayHighScorePosition("Cam", 50);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 0;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            // score >= 500 && score < 1000 can also be written as:
            // score >= 500, because we already have a condition in 'if' if
            // score is >= 1000 so, we are sure that if else if condition is
            // running then the score is less than 1000.
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        else {
            // we can also remove this else condition and simply return 4 outside
            // the if else statement.
            position = 4;
        }
        return position;
    }

    public static void displayHighScorePosition(String p_name, int score) {
        int p_position = calculateHighScorePosition(score);
        String statement = p_name + " managed to get into position " +
                p_position + " on the high score table.";
        System.out.println(statement);
    }

}