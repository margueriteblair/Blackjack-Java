package com.margieblair;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BlackjackConsole {
    private List<Integer> playerCards = new ArrayList<>();

    static public void runCycle() {
        DeckOfCards gameDeck = new DeckOfCards();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println("Player, your cards are: ");
        gameDeck.draw(2);
        while (true) {
            System.out.println("Hit (1) or stand? (2)");
            int hitOrStand = scanner.nextInt();
            if (hitOrStand == 1) {
                gameDeck.draw(1);
            } else if (hitOrStand == 2) {
                break;
            }
        }
        System.out.println("Now the CPU's turn...");


    }
}
