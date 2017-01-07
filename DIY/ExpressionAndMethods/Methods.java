/**
 * Created by sudhamsu on 1/8/17.
 */
public class Methods {
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 2000;
            System.out.println("The final score is " + finalScore);
        }
    }

    public static void main(String[] args){

        calculateScore(true, 800, 5, 1000);
        calculateScore(true, 500, 80 , 900);

    }
}
