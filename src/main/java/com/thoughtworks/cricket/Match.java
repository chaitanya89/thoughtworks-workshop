package com.thoughtworks.cricket;

import com.thoughtworks.cricket.player.Player;

public class Match {

    public static final int BALLS_IN_OVER = 6;
    private final Player batsman;
    private final Player bowler;

    public Match(Player batsman, Player bowler) {
        this.batsman = batsman;
        this.bowler = bowler;
    }


    public Player playMatch(int overs, int targetScore) {

        int battingScore = 0;
        for (int i = 1; i <= overs * BALLS_IN_OVER; i++) {
            int batsmanScore = batsman.getScore();
            System.out.println("Batsman score: " + batsmanScore);
            int bowlersScore = bowler.getScore();
            System.out.println("Bowler score: " + bowlersScore);

            if (batsmanScore == bowlersScore)
                return bowler;

            battingScore += batsmanScore;

            if (battingScore >= targetScore)
                return batsman;
        }
        return bowler;
    }

}
