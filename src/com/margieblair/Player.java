package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand{
    private List<Integer> playerCards = new ArrayList<>();
    private int points;
    private String name;

    public Player(String name, int bet) {
        super(name, bet);
    }

    public void draw(int numDraw) {
        if (cards.size() == 0) {
            System.out.println("No more cards to draw");
            return;
        }
        for (int i = 0; i < numDraw; i++) {
            cards.get(0).displayCard();
            if (BlackjackConsole.getPlayer().equals("Player")) {
                playerCards.add(cards.get(0).returnCardValue());
            }
            cards.remove(0);
        }
    }

    public void displayPoints() {
        var total = playerCards.stream().mapToInt(i -> i).sum();
        System.out.println(name + " your total right now is " + total + " .");
        points = total;
    }
}
