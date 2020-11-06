package com.margieblair;

public abstract class Hand {
    private String name;
    private int bet;
    private int points;

    public Hand(String name, int bet) {
        this.name = name;
        this.bet = bet;
    }

    public abstract void draw(int num);
    public abstract void displayPoints();

}
