package com.margieblair;

import java.lang.reflect.Array;
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
    public void draw(int numDraw) {
        for (int i = 0; i < numDraw; i++) {
            System.out.println(cards.get(0));
            cards.remove(0);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


}
