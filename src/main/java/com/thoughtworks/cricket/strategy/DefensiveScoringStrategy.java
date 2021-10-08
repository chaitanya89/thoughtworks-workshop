package com.thoughtworks.cricket.strategy;

import java.util.List;

public class DefensiveScoringStrategy implements ScoringStrategy {

    private final List<Integer> scores;
    public DefensiveScoringStrategy() {
        scores = List.of(0, 1, 2, 3);
    }

    @Override
    public int getScore() {
        return scores.get(RANDOM.nextInt(scores.size()));
    }
}
