package com.thoughtworks.cricket.strategy;

import java.util.Random;

public interface ScoringStrategy {
    Random RANDOM = new Random();
    int MAX_BATTING_SCORE = 6;
    int getScore();
}
