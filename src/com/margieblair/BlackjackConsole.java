package com.margieblair;

import java.util.Scanner;

public class BlackjackConsole {

    static public void runCycle() {
        DeckOfCards gameDeck = new DeckOfCards();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println("Player, your cards are: ");
        gameDeck.draw(2);
        System.out.println("Hit (1) or stand? (2)");
        int hitOrStand = scanner.nextInt();

    }
}
