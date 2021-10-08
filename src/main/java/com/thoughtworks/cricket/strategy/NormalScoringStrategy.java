package com.thoughtworks.cricket.strategy;

public class NormalScoringStrategy implements ScoringStrategy {

    @Override
    public int getScore() {
        return RANDOM.nextInt(MAX_BATTING_SCORE + 1);
    }
}
