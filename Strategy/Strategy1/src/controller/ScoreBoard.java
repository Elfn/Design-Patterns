package controller;

/**
 * Created by Elimane on Apr, 2020, at 23:41
 */
//Abstract out the common denominator which is the calculate score
//This is the context that execute each kind of algorithms
public class ScoreBoard {

    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier)
    {
        System.out.println(algorithmBase.calculateScore(taps,multiplier));
    }

}
