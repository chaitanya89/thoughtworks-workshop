package com.thoughtworks.cricket;

import com.thoughtworks.cricket.Factory.ScoringFactory;
import com.thoughtworks.cricket.input.ConsoleCricketInputReader;
import com.thoughtworks.cricket.input.CricketInputReader;
import com.thoughtworks.cricket.player.Player;
import com.thoughtworks.cricket.strategy.NormalScoringStrategy;
import com.thoughtworks.cricket.strategy.ScoringStrategy;

public class CricketApp {

    private final CricketInputReader cricketInputReader;
    private final Match match;

    public CricketApp(CricketInputReader cricketInputReader, Match match) {
        this.cricketInputReader = cricketInputReader;
        this.match = match;
    }

    public static void main(String[] args) {
        Player batsman = new Player("Batsman");
        Player bowler = new Player("Bowler");
        bowler.setScoringStrategy(new NormalScoringStrategy());

        CricketApp cricketApp = new CricketApp(new ConsoleCricketInputReader(), new Match(batsman, bowler));

        int targetScore = cricketApp.cricketInputReader.readScore();
        int overs = cricketApp.cricketInputReader.readOvers();
        int batsmanType = cricketApp.cricketInputReader.readBatsmanType();
        ScoringStrategy scoringStrategy = ScoringFactory.getScoringStrategyByType(batsmanType);
        batsman.setScoringStrategy(scoringStrategy);
        Player winner = cricketApp.match.playMatch(overs, targetScore);

        System.out.println("Winner is: " + winner.getName());
    }
}
