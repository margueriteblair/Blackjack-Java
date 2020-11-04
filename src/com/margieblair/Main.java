package com.margieblair;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        for (var card : deck.cards) {
            card.displayCard(card);
        }
    }
}
