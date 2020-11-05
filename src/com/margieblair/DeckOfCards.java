package com.margieblair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    public ArrayList<Card> cards;
    private List<Integer> playerCards = new ArrayList<>();
    private List<Integer> cpuCards = new ArrayList<>();
    private int player1Total;
    private int cpuTotalPoints;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    Card card = new Card(Suit.values()[i], Ranks.values()[j]); //instantiate the card here
                    cards.add(card);
            }

        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void draw(int numDraw) {
        for (int i = 0; i < numDraw; i++) {
            cards.get(0).displayCard();
            if (BlackjackConsole.getPlayer().equals("Player")) {
                playerCards.add(cards.get(0).returnCardValue());
            } else {
                cpuCards.add(cards.get(0).returnCardValue());
            }
            cards.remove(0);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void displayPlayerTotals() {
        var playerTotal = playerCards.stream().mapToInt(i -> i).sum();
        var cpuTotal = cpuCards.stream().mapToInt(i -> i).sum();
        System.out.println(BlackjackConsole.getPlayer() + ", your total right now is " + playerTotal + " while CPU total is " + cpuTotal);

        cpuTotalPoints = cpuTotal;
        player1Total = playerTotal;
    }

    public int getPlayer1Total() {
        return player1Total;
    }

    public int getCpuTotalPoints() {
        return cpuTotalPoints;
    }


}
