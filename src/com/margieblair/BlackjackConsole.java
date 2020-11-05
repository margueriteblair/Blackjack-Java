package com.margieblair;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BlackjackConsole {

    private boolean currentPlayerHuman = true;
    private String player = currentPlayerHuman ? "Player" : "CPU";

    static public void runCycle() {
        DeckOfCards gameDeck = new DeckOfCards();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println(player + ", your cards are: ");
        gameDeck.draw(2);
        while (true) {
            System.out.println("Hit (1) or stand? (2)");
            int hitOrStand = scanner.nextInt();
            if (hitOrStand == 1) {
                gameDeck.draw(1);
                gameDeck.displayPlayerTotals();
            } else if (hitOrStand == 2) {
                break;
            } else {
                throw new IllegalArgumentException("Only input 1 or 2");
            }
        }
        System.out.println("Now the CPU's turn...");

    }
}
