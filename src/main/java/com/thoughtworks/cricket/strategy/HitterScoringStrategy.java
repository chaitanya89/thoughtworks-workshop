package com.thoughtworks.cricket.strategy;

import java.util.List;

public class HitterScoringStrategy implements ScoringStrategy {
    private final List<Integer> boundaries;
    public HitterScoringStrategy() {
        boundaries = List.of(0, 4, 6);
    }
    @Override
    public int getScore() {
        return boundaries.get(RANDOM.nextInt(boundaries.size()));
    }
}
