package com.margieblair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeckOfCards {
    public ArrayList<Card> cards;
    private List<Card> playerCards = new ArrayList<>();
    private List<Card> cpuCards = new ArrayList<>();

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
            playerCards.add(cards.get(0));
            cards.remove(0);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


}
