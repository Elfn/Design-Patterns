import com.dp.ef.EndlessRunnerGame;
import com.dp.ef.FootballGame;
import com.dp.ef.Game;

/*
*  it defines the skeleton of an algorithm in a method deferring some steps to subclasses.
* It also lets subclasses define certain steps of an algorithm without changing the algorithms structure
* */
public class Test {
    public static void main(String[] args) {
        Game game = new FootballGame();
        game.play();


    }
}
