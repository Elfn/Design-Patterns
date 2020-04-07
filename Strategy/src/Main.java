import controller.ScoreBoard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

/**
 * Created by Elimane on Apr, 2020, at 23:38
 */
public class Main {

    //STRATEGY PATTERN TO MAKE AN OBJECT VARY A PART OF ITS ALGORITHM DYNAMICALLY
    //TO ISOLATE ALGORITHMS CONTAINED IN THE SAME FAMILLY

    public static void main(String[] args)
    {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(3,4);

        System.out.println("Clown Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(3,4);

        System.out.println("SquareBalloon Tap Score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(3,4);

    }

}
