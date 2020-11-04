package com.margieblair;

public class DeckOfCards {
    private Card[] cards;

    public DeckOfCards() {
        this.cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = new Card(Suit.values()[i], Ranks.values()[j]); //instantiate the card here
            }
        }
    }
}
