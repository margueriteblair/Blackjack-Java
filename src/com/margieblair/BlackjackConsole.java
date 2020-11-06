package com.margieblair;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BlackjackConsole {
    static boolean currentPlayerHuman = true;
    static String player = currentPlayerHuman ? "Player" : "CPU";
    protected static DeckOfCards gameDeck = new DeckOfCards();

    static public void runCycle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B-) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println(BlackjackConsole.player + ", your cards are: ");
        gameDeck.draw(2);
        gameDeck.displayPlayerTotals();
        while (true) {
            System.out.println("Hit (1) or stand? (2)");
            int hitOrStand = scanner.nextInt();
            if (hitOrStand == 1) {
                gameDeck.draw(1);
                gameDeck.displayPlayerTotals();
                if (gameDeck.getPlayer1Total() > 21) {
                    System.out.println("Game over! CPU wins :(");
                    break;
                }
            } else if (hitOrStand == 2) {
                currentPlayerHuman = !currentPlayerHuman;
                System.out.println("Now it's the " + getPlayer() + "'s turn...");
                gameDeck.draw(2);
                gameDeck.displayPlayerTotals();
                while (gameDeck.getCpuTotalPoints() < 21 || gameDeck.getCpuTotalPoints() < gameDeck.getPlayer1Total()) {
                    gameDeck.draw(1);
                    gameDeck.displayPlayerTotals();
                }
                if (gameDeck.getCpuTotalPoints() < 21 && gameDeck.getCpuTotalPoints() > gameDeck.getPlayer1Total()) {
                    System.out.println("Game over! CPU wins :(");
                    return;
                } else if (gameDeck.getPlayer1Total() < 21 && gameDeck.getCpuTotalPoints() < gameDeck.getPlayer1Total()) {
                    System.out.println("Congratulations! You win :)");
                    return;
                } else if (gameDeck.getCpuTotalPoints() > 21 && gameDeck.getPlayer1Total() < 21) {
                    System.out.println("Congratulations! You win :)");
                    return;
                } else if (gameDeck.getPlayer1Total() == 21 && gameDeck.getPlayer1Total() == 21) {
                    System.out.println("This is weird...There's been a tie...?");
                    return;
                }
            } else {
                throw new IllegalArgumentException("Only input 1 or 2");
            }
        }


    }

    public static String getPlayer() {
        return currentPlayerHuman ? "Player" : "CPU";
    }

}
