package com.thoughtworks.cricket.player;

import com.thoughtworks.cricket.strategy.DefensiveScoringStrategy;
import com.thoughtworks.cricket.strategy.HitterScoringStrategy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PlayerTest {
    private Player player;

    @BeforeAll
    public void setup() {
        player = new Player("player");
    }

    @Test
    void shouldScoreOnlyBoundaries() {
        player.setScoringStrategy(new HitterScoringStrategy());
        List<Integer> scores = List.of(0, 4, 6);
        Assertions.assertThat(scores.contains(player.getScore())).isTrue();
    }

    @Test
    void shouldScoreDefensively() {
        player.setScoringStrategy(new DefensiveScoringStrategy());
        List<Integer> scores = List.of(0, 1, 2, 3);
        Assertions.assertThat(scores.contains(player.getScore())).isTrue();
    }

    @Test
    void shouldScoreNormally() {
        player.setScoringStrategy(new DefensiveScoringStrategy());
        List<Integer> scores = List.of(0, 1, 2, 3, 4, 5, 6);
        Assertions.assertThat(scores.contains(player.getScore())).isTrue();
    }
}
