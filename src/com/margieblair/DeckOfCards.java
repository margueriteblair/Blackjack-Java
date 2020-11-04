package com.margieblair;

public class DeckOfCards {
    public Card[][] cards;

    public DeckOfCards() {
        this.cards = new Card[4][13];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    Card card = new Card(Suit.values()[i], Ranks.values()[j]); //instantiate the card here
                    this.cards[i][j] = card;
            }

        }
    }
}
