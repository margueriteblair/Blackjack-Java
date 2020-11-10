package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Hand{
    private int points;
    private List<Card> cpuCards = new ArrayList<>();
    private String name;
    private int bet;

    public Dealer(String name, int bet) {
        super("CPU", 0);
        this.name = name;
        this.bet = bet;
    }

    public void displayPoints() {
        var total = cpuCards.stream().map(Card::returnCardValue).reduce(0, Integer::sum);
        System.out.println(name + " your total right now is " + total + ".");
        points = total;
    }

    public void draw(int numDraw) {
        if (BlackjackConsole.gameDeck.getCards().size() == 0) {
            System.out.println("No more cards to draw");
            return;
        }
        for (int i = 0; i < numDraw; i++) {
            BlackjackConsole.gameDeck.getCards().get(0).displayCard();
            cpuCards.add(BlackjackConsole.gameDeck.getCards().remove(0));
        }
    }

    public int getPoints() {
        return points;
    }




}
