package model;

import controller.ScoreAlgorithmBase;

/**
 * Created by Elimane on Apr, 2020, at 23:40
 */
public class SquareBalloon extends ScoreAlgorithmBase {
    @Override
    public Integer calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 30;
    }
}
