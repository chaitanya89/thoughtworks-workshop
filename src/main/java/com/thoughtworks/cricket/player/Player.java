package com.thoughtworks.cricket.player;

import com.thoughtworks.cricket.strategy.ScoringStrategy;

public class Player {

    private final String name;
    private ScoringStrategy scoringStrategy;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return scoringStrategy.getScore();
    }

    public String getName() {
        return this.name;
    }

    public void setScoringStrategy(ScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
    }
}
