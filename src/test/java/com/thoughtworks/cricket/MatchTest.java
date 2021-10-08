package com.thoughtworks.cricket;

import com.thoughtworks.cricket.player.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MatchTest {

    public static final String BATSMAN = "Batsman";
    public static final String BOWLER = "Bowler";
    private Match match;
    private Player batsman = Mockito.mock(Player.class);
    private Player bowler = Mockito.mock(Player.class);

    @BeforeAll
    public void setup() {
        match = new Match(batsman, bowler);
    }

    @BeforeEach
    public void beforeTest() {
        Mockito.when(batsman.getScore()).thenReturn(4);
        Mockito.when(bowler.getScore()).thenReturn(2);
        Mockito.when(batsman.getName()).thenReturn(BATSMAN);
        Mockito.when(bowler.getName()).thenReturn(BOWLER);
    }

    @Test
    void shouldReturnPlayerWhenMatchIsComplete() {
        Player winner = match.playMatch(2, 12);
        Assertions.assertThat(winner).isNotNull();
    }

    @Test
    void shouldReturnBatsmanAsTheWinner() {
        Player winner = match.playMatch(2, 12);
        Assertions.assertThat(winner).isNotNull();
        Assertions.assertThat(winner.getName()).isEqualTo(BATSMAN);
    }

    @Test
    void shouldReturnBowlerAsTheWinner() {
        Mockito.when(bowler.getScore()).thenReturn(4);
        Player winner = match.playMatch(2, 12);
        Assertions.assertThat(winner).isNotNull();
        Assertions.assertThat(winner.getName()).isEqualTo(BOWLER);
    }
}
