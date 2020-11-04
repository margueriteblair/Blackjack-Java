package com.margieblair;

public class DeckOfCards {
    private Card[] cards;

    public DeckOfCards() {
        this.cards = new Card[52];
        for (int i = 0; i < 52; i++) {
            Card card = new Card(); //instantiate the card here
            this.cards[i] == card;
        }
    }
}
