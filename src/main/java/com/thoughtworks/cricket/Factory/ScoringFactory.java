package com.thoughtworks.cricket.Factory;

import com.thoughtworks.cricket.strategy.DefensiveScoringStrategy;
import com.thoughtworks.cricket.strategy.HitterScoringStrategy;
import com.thoughtworks.cricket.strategy.NormalScoringStrategy;
import com.thoughtworks.cricket.strategy.ScoringStrategy;

public class ScoringFactory {

    public static ScoringStrategy getScoringStrategyByType(int type) {
        switch (type) {
            case 1:
                return new HitterScoringStrategy();
            case 2:
                return new DefensiveScoringStrategy();
            default:
                return new NormalScoringStrategy();
        }
    }
}
