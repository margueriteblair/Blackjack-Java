package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand{
    private List<Integer> playerCards = new ArrayList<>();
    private int player1Total;

    public Player(String name, int bet) {
        super(name, bet);

    }

    public void draw(int numDraw) {
//        if (cards.size() == 0) {
//            System.out.println("No more cards to draw");
//            return;
//        }
        for (int i = 0; i < numDraw; i++) {
            cards.get(0).displayCard();
            if (BlackjackConsole.getPlayer().equals("Player")) {
                playerCards.add(cards.get(0).returnCardValue());
            }
            cards.remove(0);
        }
    }
}
