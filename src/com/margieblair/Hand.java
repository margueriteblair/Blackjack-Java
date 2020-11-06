package com.margieblair;

public abstract class Hand {
    private String name;
    private int bet;
    private int points;

    public Hand(String name, int bet) {
        this.name = name;
        this.bet = bet;
    }

    public void draw() {}

    public void displayPlayerTotals() {
//        var playerTotal = playerCards.stream().mapToInt(i -> i).sum();
//        var cpuTotal = cpuCards.stream().mapToInt(i -> i).sum();
//        System.out.println("Player, your total right now is " + playerTotal + " while CPU total is " + cpuTotal);
//
//        cpuTotalPoints = cpuTotal;
//        player1Total = playerTotal;
    }

}
