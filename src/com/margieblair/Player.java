package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand{
    private List<Integer> playerCards = new ArrayList<>();
    private int points;
    private String name;
    private int bet;

    public Player(String name, int bet) {
        super(name, bet);
        this.name = name;
        this.bet = bet;
    }

    public void draw(int numDraw) {
        if (BlackjackConsole.gameDeck.getCards().size() == 0) {
            System.out.println("No more cards to draw");
            return;
        }
        for (int i = 0; i < numDraw; i++) {
            BlackjackConsole.gameDeck.getCards().get(0).displayCard();
            playerCards.add(BlackjackConsole.gameDeck.getCards().get(0).returnCardValue());
            BlackjackConsole.gameDeck.getCards().remove(0);
        }
    }

    public void displayPoints() {
        var total = playerCards.stream().mapToInt(i -> i).sum();
        System.out.println(name + " your total right now is " + total + " .");
        points = total;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getBet() {
        return bet;
    }
}
