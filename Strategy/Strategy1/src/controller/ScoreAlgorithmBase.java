package controller;

/**
 * Created by Elimane on Apr, 2020, at 23:41
 */
//Base Interface
public abstract class ScoreAlgorithmBase {

    //Method that define strategy
    public abstract Integer calculateScore(int taps, int multiplier);
}
