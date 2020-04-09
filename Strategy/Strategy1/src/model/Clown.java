package model;

import controller.ScoreAlgorithmBase;

/**
 * Created by Elimane on Apr, 2020, at 23:39
 */
public class Clown extends ScoreAlgorithmBase {
    @Override
    public Integer calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;    }
}
