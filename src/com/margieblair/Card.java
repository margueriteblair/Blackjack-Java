package com.margieblair;

public class Card {
    private Suit suit;
    private Ranks rank;

    public Card(Suit suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void displayCard(Card card) {
        System.out.println(card.suit + " " + card.rank);
    }


}
