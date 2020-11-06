package com.margieblair;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BlackjackConsole {
    static boolean currentPlayerHuman = true;
    protected static DeckOfCards gameDeck = new DeckOfCards();
    private static Player player1 = new Player("Margie", 20);
    private static Dealer dealer = new Dealer("CPU", 10);

    static public void runCycle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B-) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println(player1.getName() + ", your cards are: ");
        player1.draw(2);
        player1.displayPlayerTotals();
        while (true) {
            System.out.println("Hit (1) or stand? (2)");
            int hitOrStand = scanner.nextInt();
            if (hitOrStand == 1) {
                player1.draw(1);
                player1.displayPlayerTotals();
                if (player1.getPoints() > 21) {
                    System.out.println("Game over! CPU wins :(");
                    break;
                }
            } else if (hitOrStand == 2) {
                currentPlayerHuman = !currentPlayerHuman;
                System.out.println("Now it's the " + getPlayer() + "'s turn...");
                dealer.draw(2);
                gameDeck.();
                while (dealer.getPoints() < 21 || gameDeck.getCpuTotalPoints() < gameDeck.getPlayer1Total()) {
                    dealer.draw(1);
                    dealer.displayPoints();
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
