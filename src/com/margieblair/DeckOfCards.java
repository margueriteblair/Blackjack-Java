package com.margieblair;

import java.util.ArrayList;

public class DeckOfCards {
    public ArrayList<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    Card card = new Card(Suit.values()[i], Ranks.values()[j]); //instantiate the card here
                    cards.add(card);
            }

        }
    }
}
