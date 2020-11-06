package com.margieblair;

public abstract class Hand {
    private String name;
    private int bet;

    public Hand(String name, int bet) {
        this.name = name;
        this.bet = bet;
    }

    public void draw() {}

}
