package com.margieblair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> cards;
    private final static int[] RANKS = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12, 13};

    public DeckOfCards() {
        this.cards = new ArrayList<>();
            for (int i = 0; i < Suit.values().length; i++) {
                for (int j = 0; j < RANKS.length; j++) {
                    Card card = new Card(Suit.values()[i], RANKS[j]); //instantiate the card here
                    cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }





}
