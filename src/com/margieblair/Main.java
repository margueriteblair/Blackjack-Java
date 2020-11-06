package com.margieblair;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
//        for (var card : deck.getCards()) {
//            card.displayCard();
//        }
//        deck.shuffle();
       deck.draw(2);
       deck.draw(3);
//            BlackjackConsole.runCycle();

    }
}
