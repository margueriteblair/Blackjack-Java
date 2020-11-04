package com.margieblair;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        for (int i = 0; i < deck.cards.length; i++) {
            for (int j = 0; j < deck.cards[i].length; j++) {
                System.out.println((deck.cards[i][j]).displayCard());
            }
        }

    }
}
